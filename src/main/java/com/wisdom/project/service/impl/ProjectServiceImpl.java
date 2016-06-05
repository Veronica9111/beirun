package com.wisdom.project.service.impl;
import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wisdom.common.mapper.CompanyMapper;
import com.wisdom.common.mapper.JianYiJiShuiFangFaZhuanPiaoJiShuiMapper;
import com.wisdom.common.mapper.JianYiJiShuiFangFaPuPiaoJiShuiMapper;
import com.wisdom.common.mapper.KaiPiaoShenQingDanMapper;
import com.wisdom.common.mapper.WeiKaiJuFaPiaoMingXiMapper;
import com.wisdom.common.mapper.WeiKaiJuFaPiaoMingXi_YiBanMapper;
import com.wisdom.common.mapper.XiangMuTaiZhangMapper;
import com.wisdom.common.mapper.ZhuanYongFaPiaoKaiJuMingXiMapper;
import com.wisdom.common.mapper.PermissionMapper;
import com.wisdom.common.mapper.PuTongFaPiaoKaiJuMingXiMapper;
import com.wisdom.common.mapper.QueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper;
import com.wisdom.common.mapper.QueRenShouRuFangShi_QiTaMapper;
import com.wisdom.common.mapper.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper;
import com.wisdom.common.mapper.QueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper;
import com.wisdom.common.mapper.RecordMapper;
import com.wisdom.common.mapper.ShouQiKuanXiangMingXiBiaoMapper;
import com.wisdom.common.mapper.XiangMuTaiZhangMapper;
import com.wisdom.common.mapper.XiaoXiang_XiangMuMapper;
import com.wisdom.common.model.Company;
import com.wisdom.common.model.JianYiJiShuiFangFaZhuanPiaoJiShui;
import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.PuTongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.WeiKaiJuFaPiaoMingXi;
import com.wisdom.common.model.WeiKaiJuFaPiaoMingXi_YiBan;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.ZhuanYongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.QueRenShouRuFangShi_LaoWuShiJianZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_QiTa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiWanGongGongZuoLiangFa;
import com.wisdom.common.model.Record;
import com.wisdom.common.model.ShouQiKuanXiangMingXiBiao;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.XiaoXiang_XiangMu;
import com.wisdom.invoice.service.IInvoiceService;
import com.wisdom.project.service.IProjectService;

@Service("projectService")
public class ProjectServiceImpl implements IProjectService {


	  @Autowired
	  private	XiangMuTaiZhangMapper xiangmutaizhangMapper;
	  
	  @Autowired
	  private	CompanyMapper companyMapper;
	  
	  @Autowired
	  private KaiPiaoShenQingDanMapper kaiPiaoShenQingDanMapper;
	  
	  @Autowired
	  private JianYiJiShuiFangFaZhuanPiaoJiShuiMapper jianyijishuifangfazhuanpiaojishuiMapper;
	  
	  @Autowired
	  private JianYiJiShuiFangFaPuPiaoJiShuiMapper jianYiJiShuiFangFaPuPiaoJiShuiMapper;
	  
	  @Autowired
	  private PuTongFaPiaoKaiJuMingXiMapper puTongFaPiaoKaiJuMingXiMapper;
	  
	  @Autowired
	  private ShouQiKuanXiangMingXiBiaoMapper shouQiKuanXiangMingXiBiaoMapper;

	public ShouQiKuanXiangMingXiBiaoMapper getShouQiKuanXiangMingXiBiaoMapper() {
		return shouQiKuanXiangMingXiBiaoMapper;
	}

	public void setShouQiKuanXiangMingXiBiaoMapper(ShouQiKuanXiangMingXiBiaoMapper shouQiKuanXiangMingXiBiaoMapper) {
		this.shouQiKuanXiangMingXiBiaoMapper = shouQiKuanXiangMingXiBiaoMapper;
	}

	public PuTongFaPiaoKaiJuMingXiMapper getPuTongFaPiaoKaiJuMingXiMapper() {
		return puTongFaPiaoKaiJuMingXiMapper;
	}

	public void setPuTongFaPiaoKaiJuMingXiMapper(PuTongFaPiaoKaiJuMingXiMapper puTongFaPiaoKaiJuMingXiMapper) {
		this.puTongFaPiaoKaiJuMingXiMapper = puTongFaPiaoKaiJuMingXiMapper;
	}
	  private ZhuanYongFaPiaoKaiJuMingXiMapper zhuanYongFaPiaoKaiJuMingXiMapper;
	  
	  @Autowired
	  private WeiKaiJuFaPiaoMingXiMapper weiKaiJuFaPiaoMingXiMapper;
	  
	  @Autowired
	  private WeiKaiJuFaPiaoMingXi_YiBanMapper weiKaiJuFaPiaoMingXi_YiBanMapper;
	  
	  public WeiKaiJuFaPiaoMingXiMapper getWeiKaiJuFaPiaoMingXiMapper(){
		  return weiKaiJuFaPiaoMingXiMapper;
	  }
	  
	  public void setWeiKaiJuFaPiaoMingXiMapper(WeiKaiJuFaPiaoMingXiMapper weiKaiJuFaPiaoMingXiMapper){
		  this.weiKaiJuFaPiaoMingXiMapper = weiKaiJuFaPiaoMingXiMapper;
	  }
	  
	  public WeiKaiJuFaPiaoMingXi_YiBanMapper getWeiKaiJuFaPiaoMingXi_YiBanMapper(){
		  return weiKaiJuFaPiaoMingXi_YiBanMapper;
	  }
	  
	  public void setWeiKaiJuFaPiaoMingXi_YiBanMapper(WeiKaiJuFaPiaoMingXi_YiBanMapper weiKaiJuFaPiaoMingXi_YiBanMapper){
		  this.weiKaiJuFaPiaoMingXi_YiBanMapper = weiKaiJuFaPiaoMingXi_YiBanMapper;
	  }
	  
	  public ZhuanYongFaPiaoKaiJuMingXiMapper getZhuanYongFaPiaoKaiJuMingXiMapper(){
		  return zhuanYongFaPiaoKaiJuMingXiMapper;
	  }
	  
	  public void setzhuanYongFaPiaoKaiJuMingXiMapper(ZhuanYongFaPiaoKaiJuMingXiMapper zhuanYongFaPiaoKaiJuMingXiMapper){
		  this.zhuanYongFaPiaoKaiJuMingXiMapper = zhuanYongFaPiaoKaiJuMingXiMapper;
	  }
	  private QueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper;
	  
	  @Autowired
	  private QueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper;

	  @Autowired
	  private QueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper;
	  
	  @Autowired
	  private QueRenShouRuFangShi_QiTaMapper queRenShouRuFangShi_QiTaMapper;
	  
	  @Autowired
	  private XiaoXiang_XiangMuMapper xiaoXiang_XiangMuMapper;


	public JianYiJiShuiFangFaPuPiaoJiShuiMapper getJianYiJiShuiFangFaPuPiaoJiShuiMapper() {
		return jianYiJiShuiFangFaPuPiaoJiShuiMapper;
	}

	public void setJianYiJiShuiFangFaPuPiaoJiShuiMapper(
			JianYiJiShuiFangFaPuPiaoJiShuiMapper jianYiJiShuiFangFaPuPiaoJiShuiMapper) {
		this.jianYiJiShuiFangFaPuPiaoJiShuiMapper = jianYiJiShuiFangFaPuPiaoJiShuiMapper;
	}

	private static final Logger logger = LoggerFactory
			.getLogger(ProjectServiceImpl.class);
	
	
	public void setXiangMuTaiZhangMapper(XiangMuTaiZhangMapper xiangmutaizhangMapper) {
		    this.xiangmutaizhangMapper = xiangmutaizhangMapper;
	}
	
	public void setKaiPiaoShenQingDanMapper(KaiPiaoShenQingDanMapper kaiPiaoShenQingDanMapper) {
	    this.kaiPiaoShenQingDanMapper = kaiPiaoShenQingDanMapper;
}
	
	public void setJianYiJiShuiFangFaZhuanPiaoJiShuiMapper(JianYiJiShuiFangFaZhuanPiaoJiShuiMapper jianyijishuifangfazhuanpiaojishuiMapper) {
	    this.jianyijishuifangfazhuanpiaojishuiMapper = jianyijishuifangfazhuanpiaojishuiMapper;
}
	
	public JianYiJiShuiFangFaZhuanPiaoJiShuiMapper getJianyijishuifangfazhuanpiaojishuiMapper() {
		return jianyijishuifangfazhuanpiaojishuiMapper;
	}

	public void setJianyijishuifangfazhuanpiaojishuiMapper(
			JianYiJiShuiFangFaZhuanPiaoJiShuiMapper jianyijishuifangfazhuanpiaojishuiMapper) {
		this.jianyijishuifangfazhuanpiaojishuiMapper = jianyijishuifangfazhuanpiaojishuiMapper;
	}

	public void setCompanyMapper(CompanyMapper companyMapper) {
	    this.companyMapper = companyMapper;
}
	
	public void setQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper(QueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper) {
	    this.queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper = queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper;
}
	
	public void setQueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper(QueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper) {
	    this.queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper = queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper;
}
	
	public void setQueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper(QueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper) {
	    this.queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper = queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper;
}
	
	public void setQueRenShouRuFangShi_QiTaMapper(QueRenShouRuFangShi_QiTaMapper queRenShouRuFangShi_QiTaMapper) {
	    this.queRenShouRuFangShi_QiTaMapper = queRenShouRuFangShi_QiTaMapper;
}
	
	
	
	public void setXiaoXiang_XiangMuMapper(XiaoXiang_XiangMuMapper xiaoXiang_XiangMuMapper) {
	    this.xiaoXiang_XiangMuMapper = xiaoXiang_XiangMuMapper;
}

	@Override
	public Boolean addProject(XiangMuTaiZhang xmtz) {
		xiangmutaizhangMapper.addXiangMuTaiZhang(xmtz);
		return true;
	}


	@Override
	public XiangMuTaiZhang getXiangMuTaiZhangById(Long id) {
		return xiangmutaizhangMapper.getXiangMuTaiZhangById(id);
	}


	@Override
	public Boolean updateProject(XiangMuTaiZhang xmtz) {

		Integer result = xiangmutaizhangMapper.updateXiangMuTaiZhang(xmtz);
		result = result;
		return true;
	}
	
	@Override
	public Boolean addJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs) {

		jianyijishuifangfazhuanpiaojishuiMapper.addJianYiJiShuiFangFaZhuanPiaoJiShui(jyjsffzpjs);
		return true;
	}
	
	
	
	@Override
	public List<XiangMuTaiZhang> getProjectsByCompanyId(Integer companyId) {
		return xiangmutaizhangMapper.getXiangMuTaiZhangByCompanyId((long)companyId);

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
	public WeiKaiJuFaPiaoMingXi getWeiKaiJuFaPiaoMingXiById(Long id){
		return weiKaiJuFaPiaoMingXiMapper.getWeiKaiJuFaPiaoMingXiById(id);
	}
	
	@Override
	public void addWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx){
		weiKaiJuFaPiaoMingXiMapper.addWeiKaiJuFaPiaoMingXi(wkjfpmx);
	}
	
	@Override 
	public void updateWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx){
		weiKaiJuFaPiaoMingXiMapper.updateWeiKaiJuFaPiaoMingXi(wkjfpmx);
	}
	
	@Override
	public WeiKaiJuFaPiaoMingXi_YiBan getWeiKaiJuFaPiaoMingXi_YiBanById(Long id){
		return weiKaiJuFaPiaoMingXi_YiBanMapper.getWeiKaiJuFaPiaoMingXi_YiBanById(id);
	}
	
	@Override
	public void addWeiKaiJuFaPiaoMingXi_YiBan(WeiKaiJuFaPiaoMingXi_YiBan wkjfpmx_yb){
		weiKaiJuFaPiaoMingXi_YiBanMapper.addWeiKaiJuFaPiaoMingXi_YiBan(wkjfpmx_yb);
	}
	
	@Override 
	public void updateWeiKaiJuFaPiaoMingXi_YiBan(WeiKaiJuFaPiaoMingXi_YiBan wkjfpmx_yb){
		weiKaiJuFaPiaoMingXi_YiBanMapper.updateWeiKaiJuFaPiaoMingXi_YiBan(wkjfpmx_yb);
	}
	
	@Override
	public ZhuanYongFaPiaoKaiJuMingXi getZhuanYongFaPiaoKaiJuMingXiById(Long id){
		return zhuanYongFaPiaoKaiJuMingXiMapper.getZhuanYongFaPiaoKaiJuMingXiById(id);
	}
	@Override
	public void addZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx){
		zhuanYongFaPiaoKaiJuMingXiMapper.addZhuanYongFaPiaoKaiJuMingXi(zyfpkjmx);
	}
	
	@Override
	public void updateZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx){
		zhuanYongFaPiaoKaiJuMingXiMapper.updateZhuanYongFaPiaoKaiJuMingXi(zyfpkjmx);
	}
	
	@Override
	public List<KaiPiaoShenQingDan> getKaiPiaoShenQingDanByProjectId(Long projectId) {
		List<KaiPiaoShenQingDan> kaipiaoshenqingdanlist = kaiPiaoShenQingDanMapper.getKaiPiaoShenQingDanByProjectId(projectId);
		
		return kaipiaoshenqingdanlist;
	}
	
	@Override
	public JianYiJiShuiFangFaZhuanPiaoJiShui getJianYiJiShuiFangFaZhuanPiaoJiShuiById(Long Id) {
		JianYiJiShuiFangFaZhuanPiaoJiShui jianyijishuifangfazhuanpiaojishui = jianyijishuifangfazhuanpiaojishuiMapper.getJianYiJiShuiFangFaZhuanPiaoJiShuiById(Id);
		
		return jianyijishuifangfazhuanpiaojishui;
	}

	@Override
	public Boolean addXiangMuTaiZhang(XiangMuTaiZhang xmtz) {
		Integer result = xiangmutaizhangMapper.addXiangMuTaiZhang(xmtz);
	/*	xmtz = xmtz;
		Long id = xmtz.getId();
		String hetongqiandingshijian = xmtz.getHetongkaigongshijian();
		String hetongkaigongshijian = xmtz.getHetongkaigongshijian();
		String kaigongxukezhengshijian = xmtz.getKaigongxukezhengshijian();
		String yujiwangongshijian = xmtz.getYujiwangongshijian();
		
		this.updateTime(id, hetongqiandingshijian, hetongkaigongshijian, kaigongxukezhengshijian,yujiwangongshijian);*/
		return true;
	}

	@Override
	public Boolean updateXiangMuTaiZhang(XiangMuTaiZhang xmtz) {

		xiangmutaizhangMapper.updateXiangMuTaiZhang(xmtz);
		return true;
	}
	
	
	
	@Override
	public List<XiangMuTaiZhang> getXiangMuTaiZhangByCompanyId(Long companyId) {
		return xiangmutaizhangMapper.getXiangMuTaiZhangByCompanyId(companyId);

	}

	@Override
	public List<KaiPiaoShenQingDan> getJianYiJiShuiFangFaZhuanPiaoJiShuiByProjectId(Integer projectId) {
		// TODO Auto-generated method stub
		return null;
	}
	public KaiPiaoShenQingDan getKaiPiaoShenQingDanById(Long id) {
		return kaiPiaoShenQingDanMapper.getKaiPiaoShenQingDanById(id);
	}

	@Override
	public Boolean updateKaiPiaoShenQingDan(KaiPiaoShenQingDan kpsqd) {
		kaiPiaoShenQingDanMapper.updateKaiPiaoShenQingDan(kpsqd);
		return true;
	}

	@Override
	public Boolean updateJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffppjs) {
		jianYiJiShuiFangFaPuPiaoJiShuiMapper.updateJianYiJiShuiFangFaPuPiaoJiShui(jyjsffppjs);
		return true;
	}

	@Override
	public Boolean addJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffppjs) {
		jianYiJiShuiFangFaPuPiaoJiShuiMapper.addJianYiJiShuiFangFaPuPiaoJiShui(jyjsffppjs);
		return true;
	}

	@Override
	public JianYiJiShuiFangFaPuPiaoJiShui getJianYiJiShuiFangFaPuPiaoJiShuiById(Long id) {
		return jianYiJiShuiFangFaPuPiaoJiShuiMapper.getJianYiJiShuiFangFaPuPiaoJiShuiById(id);
	}
	
	public void updateTime(Long id, Timestamp hetongqiandingshijian) {
		xiangmutaizhangMapper.updateTime(id, hetongqiandingshijian);
		xiangmutaizhangMapper.addTime(hetongqiandingshijian);
		
	}



    @Override
    public Boolean addQueRenShouRuFangShi_QiTa(QueRenShouRuFangShi_QiTa qrsrfs_qt) {
		queRenShouRuFangShi_QiTaMapper.addQueRenShouRuFangShi_QiTa(qrsrfs_qt);
		return true;
	}

	@Override
	public Boolean updateJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs) {
		jianyijishuifangfazhuanpiaojishuiMapper.updateJianYiJiShuiFangFaZhuanPiaoJiShui(jyjsffzpjs);
	    return true;
    }
    public QueRenShouRuFangShi_QiTa getQueRenShouRuFangShi_QiTaById(Long id) {
		return queRenShouRuFangShi_QiTaMapper.getQueRenShouRuFangShi_QiTaById(id);
	}

	@Override
	public Boolean updateQueRenShouRuFangShi_QiTa(QueRenShouRuFangShi_QiTa qrsrfs_qt) {

		queRenShouRuFangShi_QiTaMapper.updateQueRenShouRuFangShi_QiTa(qrsrfs_qt);
		return true;
	}

	@Override
	public Boolean addQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(
			QueRenShouRuFangShi_LaoWuShiJianZhanBiFa queRenShouRuFangShi_LaoWuShiJianZhanBiFa) {
		queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper.addQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(queRenShouRuFangShi_LaoWuShiJianZhanBiFa);
		return true;
	}

	@Override
	public QueRenShouRuFangShi_LaoWuShiJianZhanBiFa getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaById(Long id) {
		return queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper.getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaById(id);
		
	}

	@Override
	public Boolean updateQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(
			QueRenShouRuFangShi_LaoWuShiJianZhanBiFa queRenShouRuFangShi_LaoWuShiJianZhanBiFa) {
		queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper.updateQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(queRenShouRuFangShi_LaoWuShiJianZhanBiFa);
		return true;
	}

	@Override
	public QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaById(Long id) {
		// TODO Auto-generated method stub
		return queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper.getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaById(id);
	}

	@Override
	public Boolean addQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(
			QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa) {
		// TODO Auto-generated method stub
		queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper.addQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);
		return true;
	}

	@Override
	public Boolean updateQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(
			QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa) {
		// TODO Auto-generated method stub
		queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper.updateQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);
		return true;
	}

	@Override
	public Boolean addPuTongFaPiaoKaiJuMingXi(PuTongFaPiaoKaiJuMingXi ptf) {
		puTongFaPiaoKaiJuMingXiMapper.addPuTongFaPiaoKaiJuMingXi(ptf);
		return true;
	}

	@Override
	public Boolean updatePuTongFaPiaoKaiJuMingXi(PuTongFaPiaoKaiJuMingXi ptf) {
		puTongFaPiaoKaiJuMingXiMapper.updatePuTongFaPiaoKaiJuMingXi(ptf);
		return true;
	}
	
	public QueRenShouRuFangShi_YiWanGongGongZuoLiangFa getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaById(Long id) {
		// TODO Auto-generated method stub
		return queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper.getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaById(id);
	}

	@Override
	public Boolean addQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(
			QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa) {
		// TODO Auto-generated method stub
		queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper.addQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(queRenShouRuFangShi_YiWanGongGongZuoLiangFa);
		return true;
	}

	@Override
	public PuTongFaPiaoKaiJuMingXi getPuTongFaPiaoKaiJuMingXiById(Long id) {
		return puTongFaPiaoKaiJuMingXiMapper.getPuTongFaPiaoKaiJuMingXiById(id);
	}

	@Override
	public Boolean addShouQiKuanXiangMingXiBiao(ShouQiKuanXiangMingXiBiao ptf) {
		shouQiKuanXiangMingXiBiaoMapper.addShouQiKuanXiangMingXiBiao(ptf);
		return true;
	}

	@Override
	public Boolean updateShouQiKuanXiangMingXiBiao(ShouQiKuanXiangMingXiBiao ptf) {
		shouQiKuanXiangMingXiBiaoMapper.updateShouQiKuanXiangMingXiBiao(ptf);
		return true;
	}

	public Boolean updateQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(
			QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa) {
		// TODO Auto-generated method stub
		queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper.updateQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(queRenShouRuFangShi_YiWanGongGongZuoLiangFa);

		return true;
	}

	@Override
	public XiaoXiang_XiangMu getXiaoXiang_XiangMuById(Long id) {
		// TODO Auto-generated method stub
		return xiaoXiang_XiangMuMapper.getXiaoXiang_XiangMuById(id);
	}

	@Override
	public Boolean addXiaoXiang_XiangMu(XiaoXiang_XiangMu xiaoXiang_XiangMu) {
		// TODO Auto-generated method stub
		xiaoXiang_XiangMuMapper.addXiaoXiang_XiangMu(xiaoXiang_XiangMu);
		return true;
	}

	@Override
	public ShouQiKuanXiangMingXiBiao getShouQiKuanXiangMingXiBiaoById(Long id) {
		return shouQiKuanXiangMingXiBiaoMapper.getShouQiKuanXiangMingXiBiaoById(id);
	}
	public Boolean updateXiaoXiang_XiangMu(XiaoXiang_XiangMu xiaoXiang_XiangMu) {
		// TODO Auto-generated method stub
		xiaoXiang_XiangMuMapper.updateXiaoXiang_XiangMu(xiaoXiang_XiangMu);
		return true;
	}

	@Override
	public Boolean updateProject(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
/*	@Override
	public void updateTime(Long id, String hetongqiandingshijian, String hetongkaigongshijian, String kaigongxukezhengshijian, String yujiwangongshijian) {

		xiangmutaizhangMapper.updateTime(id, hetongqiandingshijian, hetongkaigongshijian, kaigongxukezhengshijian, yujiwangongshijian);
		//xiangmutaizhangMapper.addTime(hetongqiandingshijian);
		
	}*/
}
