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
import com.wisdom.common.mapper.InvoiceMapper;
import com.wisdom.common.mapper.PermissionMapper;
import com.wisdom.common.mapper.RecordMapper;
import com.wisdom.common.mapper.XiangMuTaiZhangMapper;
import com.wisdom.common.model.Invoice;
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
	  





	private static final Logger logger = LoggerFactory
			.getLogger(ProjectServiceImpl.class);
	
	
	public void setXiangMuTaiZhangMapper(XiangMuTaiZhangMapper xiangmutaizhangMapper) {
		    this.xiangmutaizhangMapper = xiangmutaizhangMapper;
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

	
}