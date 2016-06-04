package com.wisdom.project.service.impl;
import static java.lang.Math.toIntExact;

import java.io.IOException;
import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wisdom.common.mapper.ArtifactMapper;
import com.wisdom.common.mapper.CompanyMapper;
import com.wisdom.common.mapper.InvoiceMapper;
import com.wisdom.common.mapper.KaiPiaoShenQingDanMapper;
import com.wisdom.common.mapper.PermissionMapper;
import com.wisdom.common.mapper.RecordMapper;
import com.wisdom.common.mapper.XiangMuTaiZhangMapper;
import com.wisdom.common.model.Company;
import com.wisdom.common.model.Invoice;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.Record;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.invoice.service.IInvoiceService;
import com.wisdom.project.service.IProjectService;
import com.wisdom.utils.RedisSetting;
import com.wisdom.utils.SystemSetting;

import net.sf.json.JSONArray;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import com.wisdom.common.utils.ReadingXML;
import com.wisdom.common.utils.WriteXML;

@Service("projectService")
public class ProjectServiceImpl implements IProjectService {


	  @Autowired
	  private	XiangMuTaiZhangMapper xiangmutaizhangMapper;
	  
	  @Autowired
	  private	CompanyMapper companyMapper;
	  
	  @Autowired
	  private KaiPiaoShenQingDanMapper kaiPiaoShenQingDanMapper;
	  





	private static final Logger logger = LoggerFactory
			.getLogger(ProjectServiceImpl.class);
	
	
	public void setXiangMuTaiZhangMapper(XiangMuTaiZhangMapper xiangmutaizhangMapper) {
		    this.xiangmutaizhangMapper = xiangmutaizhangMapper;
	}
	
	public void setKaiPiaoShenQingDanMapper(KaiPiaoShenQingDanMapper kaiPiaoShenQingDanMapper) {
	    this.kaiPiaoShenQingDanMapper = kaiPiaoShenQingDanMapper;
}
	
	public void setCompanyMapper(CompanyMapper companyMapper) {
	    this.companyMapper = companyMapper;
}


	@Override
	public Boolean addProject(XiangMuTaiZhang xmtz) {
		xiangmutaizhangMapper.addXiangMuTaiZhang(xmtz);
		return true;
	}


	@Override
	public XiangMuTaiZhang getXiangMuTaiZhangById(Integer id) {
		return xiangmutaizhangMapper.getXiangMuTaiZhangById(id);
	}


	@Override
	public Boolean updateProject(XiangMuTaiZhang xmtz) {

		xiangmutaizhangMapper.updateXiangMuTaiZhang(xmtz);
		return true;
	}


	@Override
	public List<XiangMuTaiZhang> getProjectsByCompanyId(Integer companyId) {
		return xiangmutaizhangMapper.getXiangMuTaiZhangByCompanyId(companyId);

	}

	public List<Company> getSubCompanyByParent(List<Company>companies, Integer parentId){
		List<Company> retList = new ArrayList<>();
		for(Company company: companies){
			if(company.getParent_id() == parentId){
				retList.add(company);
			}
		}
		return retList;
		
	}

	@Override
	public List<Map<String, Object>> getMenu() {
		/*
		[
		 {'text':name,
		  'nodes': [{},{}]}
		 ]*/
		List<Map<String, Object>> retList = new ArrayList<>();
		List<Company> companies = companyMapper.getAllCompanies();

		
		for(Company company: companies){
			if(company.getLevel() == 0){
				List<Company> subCompanies = getSubCompanyByParent(companies, company.getId());
				List<Object> tmpSubList = new ArrayList<>();
				for(Company subCompany: subCompanies){
					List<Company> subSubCompanies = getSubCompanyByParent(companies, subCompany.getId());
					
					List<Object> tmpList = new ArrayList<>();
					for(Company subSubCompany: subSubCompanies){
						Map<String, Object>  tmpMap = new HashMap<>();
						tmpMap.put("text", subSubCompany.getName());
						tmpMap.put("expanded", "false");
						tmpMap.put("level", "2");
						tmpMap.put("company_id", subSubCompany.getId());
						tmpList.add(tmpMap);
					}
					Map<String, Object> tmpMapSub = new HashMap<>();
					tmpMapSub.put("text", subCompany.getName());
					tmpMapSub.put("expanded", "false");
					tmpMapSub.put("level", "1");
					tmpMapSub.put("nodes", tmpList);
					tmpMapSub.put("company_id", subCompany.getId());
					tmpSubList.add(tmpMapSub);
					
				}
				Map<String, Object> tmpMapAll = new HashMap<>();
				tmpMapAll.put("text", company.getName());
				tmpMapAll.put("nodes", tmpSubList);
				tmpMapAll.put("expanded", "false");
				tmpMapAll.put("level", "0");
				tmpMapAll.put("company_id", company.getId());
				retList.add(tmpMapAll);
			}
		}

		return retList;
	}

	@Override
	public List<KaiPiaoShenQingDan> getKaiPiaoShenQingDanByProjectId(Integer projectId) {
		List<KaiPiaoShenQingDan> kaipiaoshenqingdanlist = kaiPiaoShenQingDanMapper.getKaiPiaoShenQingDanByProjectId(projectId);
		
		return kaipiaoshenqingdanlist;
	}

	@Override
	public Boolean addXiangMuTaiZhang(XiangMuTaiZhang xmtz) {
		xiangmutaizhangMapper.addXiangMuTaiZhang(xmtz);
		return true;
	}

	@Override
	public Boolean updateXiangMuTaiZhang(XiangMuTaiZhang xmtz) {

		xiangmutaizhangMapper.updateXiangMuTaiZhang(xmtz);
		return true;
	}
}