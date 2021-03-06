package com.wisdom.web.api.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wisdom.common.mapper.KaiPiaoQingKuangBiao_ZongGongSiMapper;
import com.wisdom.common.model.Company;
import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.JianYiJiShuiFangFaZhuanPiaoJiShui;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_FaPiao;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_RenZheng;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_FenGongSi;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_ZongGongSi;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.KaiPiao_PuTongFaPiao;
import com.wisdom.common.model.Permission;
import com.wisdom.common.model.PiaoJuWenJian;
import com.wisdom.common.model.PuTongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.QueRenShouRuFangShi_LaoWuShiJianZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_QiTa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiWanGongGongZuoLiangFa;
import com.wisdom.common.model.Role;
import com.wisdom.common.model.User;
import com.wisdom.common.model.User_Company;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.ZhuanYongFaPiaoKaiJuMingXi;
import com.wisdom.common.utils.JavaMailService;
import com.wisdom.permission.service.IPermissionService;
import com.wisdom.project.service.IProjectService;
import com.wisdom.user.service.IUserService;
import com.wisdom.utils.SessionConstant;

import net.sf.json.JSONArray;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.NumberFormatException;

@Controller
public class ProjectController {

	@Autowired
	IProjectService projectService;

	@Autowired
	IUserService userService;


	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

	@RequestMapping("/project/updateTime")
	@ResponseBody
	public Map<String, String> updateTime(HttpServletRequest request) {
		Long id = (long) 1;
		String arg = "2016-10-30 00:00:00";
		Timestamp argT = Timestamp.valueOf(arg);
		projectService.updateTime(id, argT);
		return null;
	}

	@RequestMapping("/project/addProject")
	@ResponseBody
	public Map<String, String> addProject(HttpServletRequest request) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, SecurityException, NoSuchMethodException {
		Map<String, String> retMap = new HashMap<>();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println(params.get("kaihuyinhang_yinhangzhanghao")[0]);
		XiangMuTaiZhang xmtz = new XiangMuTaiZhang();

		xmtz = setXiangMuTaiZhangModel(xmtz, params);
		projectService.addProject(xmtz);
		retMap.put("status", "ok");
		return retMap;
	}

	@RequestMapping("/project/addModel")
	@ResponseBody
	public Map<String, String> addModel(HttpServletRequest request)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException,
			InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException {
		Map<String, String> retMap = new HashMap<>();
		Map<String, String[]> params = request.getParameterMap();
		String className = params.get("class_name")[0];
		String longClassName = "com.wisdom.common.model." + className;
		Class<?> c = Class.forName(longClassName);
		Object instance = c.newInstance();
		instance = setModel(instance, params, "partial");
		System.out.println(className);
		Method m = projectService.getClass().getMethod("add" + className, instance.getClass());
		Object ret = m.invoke(projectService, instance);
		retMap.put("status", "ok");
		retMap.put("primary_id", String.valueOf(ret));
		return retMap;
	}

	@RequestMapping("/project/approveJinXiangFaPiaoMingXi_FaPiao")
	@ResponseBody
	public Map<String, String> approveJinXiangFaPiaoMingXi_FaPiao(HttpServletRequest request){
		Map<String, String> retMap = new HashMap<>();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Integer yiji_shenhe_status = Integer.valueOf(request.getParameter("yiji_shenhe_status"));
		String beizhu = request.getParameter("beizhu");
		projectService.approveJinXiangFaPiaoMingXi_FaPiao(id,yiji_shenhe_status,beizhu);
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/approveJinXiangFaPiaoMingXi_RenZheng")
	@ResponseBody
	public Map<String, String> approveJinXiangFaPiaoMingXi_RenZheng(HttpServletRequest request){
		Map<String, String> retMap = new HashMap<>();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Integer yiji_shenhe_status = Integer.valueOf(request.getParameter("yiji_shenhe_status"));
		String beizhu = request.getParameter("beizhu");
		projectService.approveJinXiangFaPiaoMingXi_RenZheng(id,yiji_shenhe_status,beizhu);
		retMap.put("status", "ok");
		return retMap;
	}
	
	
	@RequestMapping("/project/modifyModel")
	@ResponseBody
	public Map<String, String> ModifyModelById(HttpServletRequest request)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException {
		Map<String, String> retMap = new HashMap<>();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Map<String, String[]> params = request.getParameterMap();
		String className = params.get("class_name")[0];
		Method m = projectService.getClass().getMethod("get" + className + "ById", Long.class);
		Object instance = m.invoke(projectService, Long.valueOf(id));
		//String longClassName = "com.wisdom.common.model." + className;
		//Class c = Class.forName(longClassName);
		//Object instance = c.newInstance();
		instance = setModel(instance, params, "full");
		Method m2 = projectService.getClass().getMethod("update" + className, instance.getClass());
		Object ret = m2.invoke(projectService, instance);
		retMap.put("status", "ok");
		return retMap;
	}

	public boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}

	@RequestMapping("/project/getModel")
	@ResponseBody
	public Map<String, String> getModel(HttpServletRequest request)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException {
		Map<String, String> retMap = new HashMap<>();
		Map<String, String[]> params = request.getParameterMap();
		String className = params.get("class_name")[0];
		String queryKey = params.get("query_key")[0];
		String queryValue = params.get("query_value")[0];
		queryKey = queryKey.substring(0, 1).toUpperCase() + queryKey.substring(1);
		Object ret;
		if (isInteger(queryValue)) {
			if (("Xiangmutaizhang_id").equals(queryKey) &&!className.equals("JinXiangFaPiaoMingXi_FaPiao")) {
				Method m = projectService.getClass().getMethod("get" + className + "By" + queryKey, Long.class);
				ret = m.invoke(projectService, Long.valueOf(queryValue));
				List<List<String>> retList = generateDataTableData(ret);
				ret = retList;
			} else {
				Method m = projectService.getClass().getMethod("get" + className + "By" + queryKey, Long.class);
				ret = m.invoke(projectService, Long.valueOf(queryValue));
			}
		} else {
			Method m = projectService.getClass().getMethod("get" + className + "By" + queryKey, String.class);
			ret = m.invoke(projectService, queryValue);
		}

		String data = JSONArray.fromObject(ret).toString();
		retMap.put("data", data);
		retMap.put("status", "ok");
		return retMap;

	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/project/getJinXiangAuditList")
	@ResponseBody
	public Map<String, String> getJinXiangAuditList(HttpServletRequest request, HttpSession httpSession)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException {
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		Method m = projectService.getClass().getMethod("getXiangmuCompaniesByUid", Integer.class);
		Object ret = m.invoke(projectService, uid);
		@SuppressWarnings("unchecked")
		List<JinXiangFaPiaoMingXi_FaPiao> dataList = new ArrayList<>();
		List<Company> list = (List<Company>)ret;
		for(Company com : list) {
			m = projectService.getClass().getMethod("getJinXiangFaPiaoMingXi_FaPiaoByCompany_idAndStatus", Long.class);
			ret = m.invoke(projectService, Long.valueOf(com.getId()));
			List<JinXiangFaPiaoMingXi_FaPiao> itemlist = (List<JinXiangFaPiaoMingXi_FaPiao>)ret;
			dataList.addAll(itemlist);
		}
		Map<String, String> retMap = new HashMap<>();
		String data = JSONArray.fromObject(dataList).toString();
		retMap.put("data", data);
		retMap.put("status", "ok");
		return retMap;

	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/project/getFapiaoWenjian")
	@ResponseBody
	public Map<String, String> getFapiaoWenjian(HttpServletRequest request, HttpSession httpSession)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException {
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		Method m = projectService.getClass().getMethod("getXiangmuCompaniesByUid", Integer.class);
		Object ret = m.invoke(projectService, uid);
		@SuppressWarnings("unchecked")
		List<PiaoJuWenJian> dataList = new ArrayList<>();
		List<Company> list = (List<Company>)ret;
		for(Company com : list) {
			m = projectService.getClass().getMethod("getPiaoJuWenJianByCompany_idAndStatus", Long.class);
			ret = m.invoke(projectService, Long.valueOf(com.getId()));
			List<PiaoJuWenJian> itemlist = (List<PiaoJuWenJian>)ret;
			dataList.addAll(itemlist);
		}
		Map<String, String> retMap = new HashMap<>();
		String data = JSONArray.fromObject(dataList).toString();
		retMap.put("data", data);
		retMap.put("status", "ok");
		return retMap;

	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/project/getJinXiangTaiZhangList")
	@ResponseBody
	public Map<String, String> getJinXiangTaiZhangList(HttpServletRequest request, HttpSession httpSession)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException {
		String comId = request.getParameter("companyId");
		Integer companyId = Integer.valueOf(comId);
		Method m = projectService.getClass().getMethod("getChildCompanyById", Integer.class);
		Object ret = m.invoke(projectService, companyId);
		List<Company> comList = (List<Company>)ret;
		List<Company> finalList = new ArrayList<>();
		for(Company com : comList) {
			m = projectService.getClass().getMethod("getChildCompanyById", Integer.class);
			ret = m.invoke(projectService, com.getId());
			List<Company> li = (List<Company>)ret;
			finalList.addAll(li);
		}
		if(comList.isEmpty()) {
			Company c = new Company();
			c.setId(companyId);
			comList.add(c);
		}
		if(!finalList.isEmpty()) comList = finalList;
		List<JinXiangFaPiaoMingXi_FaPiao> dataList = new ArrayList<>();
		for(Company com : comList) {
			m = projectService.getClass().getMethod("getJinXiangFaPiaoMingXi_FaPiaoByCompanyId", Long.class);
			ret = m.invoke(projectService, Long.valueOf(com.getId()));
			List<JinXiangFaPiaoMingXi_FaPiao> itemlist = (List<JinXiangFaPiaoMingXi_FaPiao>)ret;
			dataList.addAll(itemlist);
		}
		Map<String, String> retMap = new HashMap<>();
		String data = JSONArray.fromObject(dataList).toString();
		retMap.put("data", data);
		retMap.put("status", "ok");
		return retMap;
	}

	private List<List<String>> generateDataTableData(Object obj) {
		List<List<String>> list = new ArrayList<>();
		List<KaiPiaoQingKuangBiao_XiangMu> modelList = (List<KaiPiaoQingKuangBiao_XiangMu>) obj;
		for (KaiPiaoQingKuangBiao_XiangMu kpqkbxm : modelList) {
			List<String> tmpList = new ArrayList<>();
			tmpList.add(String.valueOf(kpqkbxm.getId()));
			tmpList.add(kpqkbxm.getShengqingkaipiaoshijian());
			tmpList.add(String.valueOf(kpqkbxm.getBuhanshuijine()));
			tmpList.add(String.valueOf(kpqkbxm.getShuie()));
			tmpList.add(String.valueOf(kpqkbxm.getHejijine()));
			tmpList.add(String.valueOf(kpqkbxm.getKaijufapiao()));
			tmpList.add(String.valueOf(kpqkbxm.getShouqikuanxiang()));
			tmpList.add(String.valueOf(kpqkbxm.getWangongjindu()));
			tmpList.add(String.valueOf(kpqkbxm.getQita()));
			tmpList.add(String.valueOf(kpqkbxm.getYikaipiaojine()));
			// 缺少分包发票
			tmpList.add(kpqkbxm.getYijishenheren());
			tmpList.add(kpqkbxm.getYiji_shenhe_status() == 0 ? "未审核"
					: (kpqkbxm.getYiji_shenhe_status() == 1 ? "审核通过" : "审核未通过"));
			tmpList.add(kpqkbxm.getYiji_shenhe_beizhu());
			tmpList.add(kpqkbxm.getErjishenheren());
			tmpList.add(kpqkbxm.getErji_shenhe_status() == 0 ? "未审核"
					: (kpqkbxm.getYiji_shenhe_status() == 1 ? "审核通过" : "审核未通过"));
			tmpList.add(kpqkbxm.getErji_shenhe_beizhu());
			list.add(tmpList);
		}
		return list;
	}

	@RequestMapping("/project/approveProject")
	@ResponseBody
	public Map<String, String> approveProject(HttpServletRequest request) {
		Map<String, String> retMap = new HashMap<>();
		String projectId = request.getParameter("project_id");
		String approvalName = request.getParameter("approval_name");
		String status = request.getParameter("status");
		String type = request.getParameter("type");
		System.out.println(
				"Prject Id: " + projectId + " approvalName: " + approvalName + " status: " + status + " type: " + type);
		retMap.put("status", "ok");
		return retMap;
	}

	@RequestMapping("/project/getProjectsByCompanyId")
	@ResponseBody
	public Map<String, String> getProjectsByCompanyId(HttpServletRequest request, HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		Long companyId = Long.valueOf(request.getParameter("company_id"));

		List<XiangMuTaiZhang> projects = projectService.getXiangMuTaiZhangByCompany_id(companyId);
		List<Object> retList = new ArrayList<>();
		for (XiangMuTaiZhang project : projects) {
			List<Object> tmpList = new ArrayList<>();
			tmpList.add(project.getId());
			tmpList.add(project.getXiangmumingcheng());
			retList.add(tmpList);
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		return retMap;

	}

	@RequestMapping("/project/getKaiPiaoShenQingDanByProjectId")
	@ResponseBody
	public Map<String, String> getKaiPiaoShenQingDanByProjectId(HttpServletRequest request, HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		Long projectId = Long.valueOf(request.getParameter("kaipiaoqingkuangbiao_xiangmu_id"));
		List<KaiPiaoShenQingDan> kpsqdList = projectService.getKaiPiaoShenQingDanByProjectId(projectId);
		List<Object> retList = new ArrayList<>();
		for (KaiPiaoShenQingDan kpsqd : kpsqdList) {
			List<Object> tmpList = new ArrayList<>();
			tmpList.add(kpsqd.getId());
			tmpList.add(kpsqd.getKaipiaoneirong());
			retList.add(tmpList);

		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		return retMap;
	}

	@RequestMapping("/project/redirectView")
	public String redirectView(HttpServletRequest request) {
		String view = request.getParameter("view");
		String queryString = request.getQueryString();
		int pos1 = queryString.indexOf("view="+view+"&");
		int pos2 = queryString.indexOf("view="+view);
		if(pos1 != -1) {
			queryString = queryString.replace("view="+view+"&", "").trim();
		} else if(pos2 != -1) {
			queryString = queryString.replace("view="+view, "").trim();
		}
		if(queryString.isEmpty()) {
			return "redirect:/views/recordviews/" + view;
		} else {
			return "redirect:/views/recordviews/" + view + "?" + queryString;
		}
	}

	@RequestMapping("/project/getAllProjectsForUser")
	@ResponseBody
	public Map<String, String> getAllProjectsForUser(HttpServletRequest request, HttpSession httpSession) {
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		List<List<String>> retList = new ArrayList<>();
		Map<String, String> retMap = new HashMap<>();
		List<String> tmpList = new ArrayList<>();
		tmpList.add("1");
		tmpList.add("description");
		tmpList.add("submitter");
		tmpList.add("update time");
		tmpList.add("status");
		// 开票方可编辑
		tmpList.add("<a href='/views/recordviews/edit.html?id=1'>编辑</a>");
		retList.add(tmpList);

		tmpList = new ArrayList<>();
		tmpList.add("2");
		tmpList.add("description2");
		tmpList.add("submitter2");
		tmpList.add("update time2");
		tmpList.add("status2");
		// 审核方可查看
		tmpList.add("<a href='/views/recordviews/approve.html?id=2'>查看</a>");
		retList.add(tmpList);

		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		return retMap;

	}

	@RequestMapping("/project/getProjectById")
	@ResponseBody
	public Map<String, Object> getProjectById(HttpServletRequest request) {
		Long id = Long.valueOf(request.getParameter("id"));
		XiangMuTaiZhang xmtz = projectService.getXiangMuTaiZhangById(id);
		ObjectMapper m = new ObjectMapper();
		Map<String, Object> props = m.convertValue(xmtz, Map.class);
		XiangMuTaiZhang anotherBean = (XiangMuTaiZhang) m.convertValue(props, XiangMuTaiZhang.class);
		return props;

	}

	@RequestMapping("/project/modifyProject")
	@ResponseBody
	public Map<String, String> updateProjectById(HttpServletRequest request) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Long id = Long.valueOf(request.getParameter("id"));
		XiangMuTaiZhang xmtz = projectService.getXiangMuTaiZhangById(id);
		Map<String, String[]> params = request.getParameterMap();
		xmtz = setXiangMuTaiZhangModel(xmtz, params);
		projectService.updateProject(xmtz);
		Map<String, String> retMap = new HashMap<>();
		retMap.put("status", "ok");

		return retMap;

	}

	@RequestMapping("/project/getXiangMuTaiZhangHTML")
	@ResponseBody
	public Map<String, String> getXiangMuTaiZhangHTML(HttpServletRequest request) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String type = request.getParameter("type");
		String html = "";
		Map<String, String> retMap = new HashMap<>();

		if (type.equals("create")) {
			html = "<table width='1333' border='0' cellpadding='0' cellspacing='0' style='width:666.50pt;border-collapse:collapse;table-layout:fixed;'> <tr height='42' style='height:21.00pt;'>      <td class='xl65' height='42' width='1333' colspan='10' style='height:21.00pt;width:666.50pt;border-right:none;border-bottom:none;' x:str>项 目 台 账</td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl66' height='28' colspan='2' style='text-align:left;height:14.00pt;border-right:none;border-bottom:none;' x:str>分公司名称：</td>      <td class='xl66' height='28' colspan='3' style='height:14.00pt;border-right:none;border-bottom:none;' x:str id='fengongsimingcheng'></td>      <td class='xl67' colspan='2' style='border-right:none;border-bottom:none;' x:str>项目部：</td>     <td class='xl67' colspan='3' style='border-right:none;border-bottom:none;' x:str id='xiangmubu'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl68' height='28' colspan='10' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>甲方基本信息情况表</td>    </tr>    <tr height='28' style='height:14.00pt;'>     <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>单位名称</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str ><input style='width:100%;' id='danweimingcheng'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>法定代表人、联系电话</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='fadingdaibiaoren_lianxidianhua'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>纳税人识别号</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='nashuirenshibiehao'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>开户银行、银行账号</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='kaihuyinhang_yinhangzhanghao'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>单位地址、联系电话<span style='mso-spacerun:yes;'>&nbsp;</span></td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='danweidizhi_lianxidianhua'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>项目名称</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='xiangmumingcheng'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>项目负责人、联系电话</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='xiangmufuzeren_lianxidianhua'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>合同类型</td>      <td class='xl70' colspan='8' style='text-align:left;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>     <form id='hetongleixing' style='height:20px;line-height:20px;'>            <input type='radio' name='hetongleixing_select' value='baogongbaoliao'> 包工包料           <input type='radio' name='hetongleixing_select' value='qingbaogong'> 清包工            <input type='radio' name='hetongleixing_select' value='jiagongcai'> 甲供材         <input type='radio' name='hetongleixing_select' value='qita'>其他      </form>  </td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>税率</td>      <td class='xl70' colspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='shuilv'></td>      <td class='xl70' x:str>征收率</td>      <td class='xl70' colspan='4' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='zhengshoulv'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>合同金额</td>      <td class='xl70' x:str>不含税金额</td>      <td class='xl70' id=''><input style='width:100%;' id='buhanshuijine'></td>      <td class='xl70' x:str>税额</td>      <td class='xl70' id=''><input style='width:100%;' id='shuie'></td>      <td class='xl70'></td>      <td class='xl70'></td>      <td class='xl70' x:str>合计金额</td>      <td class='xl70' id=''><input style='width:100%;' id='hejijine'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>决算金额</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='juesuanjine'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>预计合同总成本</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='yujihetongzongchengben'></td>     </tr>     <tr height='56' style='height:28.00pt;'>      <td class='xl69' height='56' colspan='2' style='height:28.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>合同签订时间</td>      <td class='xl70' colspan='2' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='hetongqiandingshijian'></td>      <td class='xl71' x:str>合同开工时间</td>      <td class='xl71' id=''><input style='width:100%;' id='hetongkaigongshijian'></td>      <td class='xl71' x:str>开工许可证时间</td>      <td class='xl71' id=''><input style='width:100%;' id='kaigongxukezhengshijian'></td>      <td class='xl71' x:str>预计完工时间</td>      <td class='xl71' id=''><input style='width:100%;' id='yujiwangongshijian'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>合同付款方式</td>      <td class='xl70' colspan='8' style='text-align:left;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>     <form id='hetongfukuanfangshi' style='height:20px;line-height:20px;'>          <input type='radio' name='hetongfukuanfangshi_select' value='yicixingfukuan'>一次性付款            <input type='radio' name='hetongfukuanfangshi_select' value='qingbaogong'>完工进度         <input type='radio' name='hetongfukuanfangshi_select' value='jiagongcai'>其它      </form>    </td>     </tr>    </table><input id='create-xiangmutaizhang' type='button' value='创建'/>";
			retMap.put("data", html);
		}
		retMap.put("status", "ok");

		return retMap;

	}

	@RequestMapping("/project/getKaiPiaoShenQingDanHTML")
	@ResponseBody
	public Map<String, String> getKaiPiaoShenQingDanHTML(HttpServletRequest request) {
		String type = request.getParameter("type");
		String html = "";
		Map<String, String> retMap = new HashMap<>();
		if (type.equals("create")) {
			html = "  <table width='1097' border='0' cellpadding='0' cellspacing='0' style='width:548.50pt;border-collapse:collapse;table-layout:fixed;'>  <tr height='35' style='height:17.50pt;'>    <td class='xl65' height='35' width='1097' colspan='6' style='height:17.50pt;width:548.50pt;border-right:none;border-bottom:none;' x:str>开票申请单</td>   </tr>   <tr height='28' style='height:14.00pt;'>    <td class='xl66' height='28' style='height:14.00pt;' x:str>分公司名称：</td>    <td class='xl66' id='fengongsimingcheng'></td>    <td class='xl67' colspan='2' style='border-right:none;border-bottom:.5pt solid windowtext;'></td>    <td class='xl66' x:str>项目部：</td>    <td class='xl66' id='xiangmubu'></td>   </tr>   <tr height='28' style='height:14.00pt;'>    <td class='xl68' height='28' style='height:14.00pt;' x:str>项目名称</td>    <td class='xl69' colspan='2' style='border-right:none;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='xiangmumingcheng'></td>    <td class='xl71' x:str>合同总金额</td>    <td class='xl71' colspan='2' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='hetongzongjine'></td>   </tr>   <tr height='28' style='height:14.00pt;'>    <td class='xl73' height='112' rowspan='4' style='height:56.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>申请日期</td>    <td class='xl74' rowspan='4' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>开票内容</td>    <td class='xl75' colspan='4' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>申请开票金额 （含税）</td>   </tr>   <tr height='28' style='height:14.00pt;'>    <td class='xl79' rowspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>开具发票</td>    <td class='xl80' rowspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>收讫款项</td>    <td class='xl73' rowspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>完工进度</td>    <td class='xl73' rowspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>其他</td>   </tr>   <tr height='28' style='height:14.00pt;'/>   <tr height='28' style='height:14.00pt;'/>   <tr height='28' style='height:14.00pt;'>    <td class='xl87' height='28' style='height:14.00pt;' id='shenqingriqi'><input style='width:100%;' id='shenqingriqi'></td>    <td class='xl87' id='kaipiaoneirong'><input style='width:100%;' id='kaipiaoneirong'></td>    <td class='xl87' id='kaijufapiao'><input style='width:100%;' id='kaijufapiao'></td>    <td class='xl87' id='shouqikuanxiang'><input style='width:100%;' id='shouqikuanxiang'></td>    <td class='xl87' id='wangongjindu'><input style='width:100%;' id='wangongjindu'></td>    <td class='xl87' id='qita'><input style='width:100%;' id='qita'></td>   </tr>  </table>";
			retMap.put("data", html);
		}
		retMap.put("status", "ok");
		return retMap;
	}

	@RequestMapping("/project/getUnApprovedKaiPiaoQingKuangBiao_XiangMuByUserCount")
	@ResponseBody
	public Map<String, String> getUnApprovedKaiPiaoQingKuangBiao_XiangMuByUserCount(HttpServletRequest request,
			HttpSession httpSession) {

		Map<String, String> retMap = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		//List<Company> companies = projectService.getCompaniesByUid(uid);
		List<Company> companies = projectService.getXiangmuCompaniesByUid(uid);
		List<Integer> companyIds = new ArrayList<>();
		List<KaiPiaoQingKuangBiao_XiangMu> KaiPiaoQingKuangBiaos = new ArrayList<>();

		for (Company company : companies) {
			KaiPiaoQingKuangBiaos.addAll(projectService.getKaiPiaoQingKuangBiao_XiangMuByCompanyId(company.getId()));

		}
		Integer approvalLevel = 0;
		List<Role> roles = projectService.getUserRoles(uid);
		for (Role role : roles) {
			if (role.getName().contains("一级") || role.getName().contains("业务主任")) {
				approvalLevel = 1;
			} else if (role.getName().contains("二级") || role.getName().contains("分管所长")) {
				approvalLevel = 2;
			}
		}

		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (KaiPiaoQingKuangBiao_XiangMu elem : KaiPiaoQingKuangBiaos) {

			if (approvalLevel == 1 && elem.getYiji_shenhe_status() == 0) {
				count++;

			} else if (approvalLevel == 2 && elem.getYiji_shenhe_status() == 1 && elem.getErji_shenhe_status() == 0) {
				count++;
			}

		}

		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("count", count.toString());
		retMap.put("status", "ok");
		return retMap;
	}

	@RequestMapping("/project/getAllKaiPiaoQingKuangBiao_ZongGongSi")
	@ResponseBody
	public Map<String, String> getAllKaiPiaoQingKuangBiao_ZongGongSi(HttpServletRequest request, HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		List<Company> companies = projectService.getXiangmuCompaniesByUid(uid);
		List<KaiPiaoQingKuangBiao_ZongGongSi> KaiPiaoQingKuangBiaos = new ArrayList<>();
		for(Company com : companies) {
			List<KaiPiaoQingKuangBiao_ZongGongSi> li = projectService
					.getAllKaiPiaoQingKuangBiao_ZongGongSiByCompanyId(Long.valueOf(com.getId()));
			KaiPiaoQingKuangBiaos.addAll(li);
		}
		/*Long companyId = Long.valueOf(request.getParameter("company_id"));
		List<KaiPiaoQingKuangBiao_ZongGongSi> KaiPiaoQingKuangBiaos = projectService
				.getAllKaiPiaoQingKuangBiao_ZongGongSiByCompanyId(companyId);*/
		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (KaiPiaoQingKuangBiao_ZongGongSi elem : KaiPiaoQingKuangBiaos) {
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId().toString());
			tmp.add(elem.getShengqingkaipiaoshijian());
			tmp.add(elem.getBuhanshuijine() == null? "": elem.getBuhanshuijine().toString());
			tmp.add(elem.getShuie() == null ? "":elem.getShuie().toString());
			tmp.add(elem.getHejijine() == null ? "":elem.getHejijine().toString());
			tmp.add(elem.getKaijufapiao() == null ? "":elem.getKaijufapiao().toString());
			tmp.add(elem.getShouqikuanxiang() == null ? "" : elem.getShouqikuanxiang().toString());
			tmp.add(elem.getWangongjindu());
			tmp.add(elem.getQita() == null ? "" :elem.getQita().toString());
			tmp.add(elem.getYikaipiaojine() == null ? "" :elem.getYikaipiaojine().toString());
			tmp.add(elem.getFenbaofapiao() == null ? "" : elem.getFenbaofapiao().toString());
			/*tmp.add(elem.getBeizhu());*/
			tmp.add(elem.getYijishenheren());
			String approveStatus = "未审核";
			if (elem.getYiji_shenhe_status() == 1) {
				approveStatus = "审核通过";
			} else if (elem.getYiji_shenhe_status() == 2) {
				approveStatus = "审核未通过";
			}
			tmp.add(approveStatus);
			tmp.add(elem.getYiji_shenhe_beizhu());
			tmp.add(elem.getErjishenheren());
			String approveStatus2 = "未审核";
			if (elem.getErji_shenhe_status() == 1) {
				approveStatus2 = "审核通过";
			} else if (elem.getErji_shenhe_status() == 2) {
				approveStatus2 = "审核未通过";
			}
			tmp.add(approveStatus2);
			tmp.add(elem.getErji_shenhe_beizhu());
			retList.add(tmp);
			if (elem.getErji_shenhe_status() == 0 || elem.getYiji_shenhe_status() == 0) {
				count++;
			}
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("unapproved", Integer.toString(count));
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/newGetAllKaiPiaoQingKuangBiaoByZonggongsi")
	@ResponseBody
	public Map<String, String> newGetAllKaiPiaoQingKuangBiaoByZonggongsi(HttpServletRequest request, HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		List<Company> companies = projectService.getXiangmuCompaniesByUid(uid);
		List<KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian> KaiPiaoQingKuangBiaos = new ArrayList<>();
		for(Company com : companies) {
			List<KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian> li = projectService
					.getKaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJianByCompanyId(com.getId());
			KaiPiaoQingKuangBiaos.addAll(li);
		}
		/*Long companyId = Long.valueOf(request.getParameter("company_id"));
		List<KaiPiaoQingKuangBiao_ZongGongSi> KaiPiaoQingKuangBiaos = projectService
				.getAllKaiPiaoQingKuangBiao_ZongGongSiByCompanyId(companyId);*/
		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian elem : KaiPiaoQingKuangBiaos) {
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId().toString());
			tmp.add(elem.getShengqingkaipiaoshijian());
			tmp.add(elem.getBeizhu());
			if(("zhuanpiao".equals(elem.getFapiaoleixing()))){
				tmp.add("专用发票");
			}else{
				tmp.add("普通发票");
			}
			tmp.add(elem.getBuhanshuijine() == null? "": elem.getBuhanshuijine().toString());
			tmp.add(elem.getShuie() == null ? "":elem.getShuie().toString());
			tmp.add(elem.getHejijine() == null ? "":elem.getHejijine().toString());
			tmp.add(elem.getKaijufapiao() == null ? "":elem.getKaijufapiao().toString());
			tmp.add(elem.getShouqikuanxiang() == null ? "" : elem.getShouqikuanxiang().toString());
			tmp.add(elem.getWangongjindu());
			tmp.add(elem.getQita() == null ? "" :elem.getQita().toString());
			tmp.add(elem.getFenbaofapiao() == null ? "" : elem.getFenbaofapiao().toString());
			tmp.add(elem.getYikaipiaojine() == null ? "" :elem.getYikaipiaojine().toString());
			tmp.add(elem.getHetongzongjine() == null ? "" : elem.getHetongzongjine().toString());
			Double weikaipiaojine = (elem.getHetongzongjine()==null ? 0.00 : elem.getHetongzongjine()) -(elem.getYikaipiaojine() == null ? 0.00 : elem.getYikaipiaojine());
			tmp.add(weikaipiaojine.toString());
			/*tmp.add(elem.getBeizhu());*/
			tmp.add(elem.getYijishenheren());
			String approveStatus = "未审核";
			if (elem.getYiji_shenhe_status() == 1) {
				approveStatus = "审核通过";
			} else if (elem.getYiji_shenhe_status() == 2) {
				approveStatus = "审核未通过";
			}
			tmp.add(approveStatus);
			tmp.add(elem.getYiji_shenhe_beizhu());
			tmp.add(elem.getErjishenheren());
			String approveStatus2 = "未审核";
			if (elem.getErji_shenhe_status() == 1) {
				approveStatus2 = "审核通过";
			} else if (elem.getErji_shenhe_status() == 2) {
				approveStatus2 = "审核未通过";
			}
			tmp.add(approveStatus2);
			tmp.add(elem.getErji_shenhe_beizhu());
			String download_file = "<a type='button' class='btn btn-info che' href='/files/image/"+elem.getHetongwenjian()+"'>合同下载</a>";
			tmp.add(download_file);
			String checkButton = "<input type='button' class='btn btn-success check'value='查看' >";
			tmp.add(checkButton);
			retList.add(tmp);
			if (elem.getErji_shenhe_status() == 0 || elem.getYiji_shenhe_status() == 0) {
				count++;
			}
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("unapproved", Integer.toString(count));
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/newGetAllKaiPiaoQingKuangBiaoByFengongsi")
	@ResponseBody
	public Map<String, String> newGetAllKaiPiaoQingKuangBiaoByFengongsi(HttpServletRequest request, HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		Integer companyId = Integer.valueOf(request.getParameter("company_id"));
		List<Company> companies = projectService.getXiaoXiangFengGongsiCompaniesByUid(uid, companyId);
		List<KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian> KaiPiaoQingKuangBiaos = new ArrayList<>();
		for(Company com : companies) {
			List<KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian> li = projectService
					.getKaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJianByCompanyId(com.getId());
			KaiPiaoQingKuangBiaos.addAll(li);
		}
		/*Long companyId = Long.valueOf(request.getParameter("company_id"));
		List<KaiPiaoQingKuangBiao_ZongGongSi> KaiPiaoQingKuangBiaos = projectService
				.getAllKaiPiaoQingKuangBiao_ZongGongSiByCompanyId(companyId);*/
		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian elem : KaiPiaoQingKuangBiaos) {
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId().toString());
			tmp.add(elem.getShengqingkaipiaoshijian());
			tmp.add(elem.getBeizhu());
			if(("zhuanpiao".equals(elem.getFapiaoleixing()))){
				tmp.add("专用发票");
			}else{
				tmp.add("普通发票");
			}
			tmp.add(elem.getBuhanshuijine() == null? "": elem.getBuhanshuijine().toString());
			tmp.add(elem.getShuie() == null ? "":elem.getShuie().toString());
			tmp.add(elem.getHejijine() == null ? "":elem.getHejijine().toString());
			tmp.add(elem.getKaijufapiao() == null ? "":elem.getKaijufapiao().toString());
			tmp.add(elem.getShouqikuanxiang() == null ? "" : elem.getShouqikuanxiang().toString());
			tmp.add(elem.getWangongjindu());
			tmp.add(elem.getQita() == null ? "" :elem.getQita().toString());
			tmp.add(elem.getFenbaofapiao() == null ? "" : elem.getFenbaofapiao().toString());
			tmp.add(elem.getYikaipiaojine() == null ? "" :elem.getYikaipiaojine().toString());
			tmp.add(elem.getHetongzongjine() == null ? "" : elem.getHetongzongjine().toString());
			Double weikaipiaojine = (elem.getHetongzongjine()==null ? 0.00 : elem.getHetongzongjine()) -(elem.getYikaipiaojine() == null ? 0.00 : elem.getYikaipiaojine());
			tmp.add(weikaipiaojine.toString());
			/*tmp.add(elem.getBeizhu());*/
			tmp.add(elem.getYijishenheren());
			String approveStatus = "未审核";
			if (elem.getYiji_shenhe_status() == 1) {
				approveStatus = "审核通过";
			} else if (elem.getYiji_shenhe_status() == 2) {
				approveStatus = "审核未通过";
			}
			tmp.add(approveStatus);
			tmp.add(elem.getYiji_shenhe_beizhu());
			tmp.add(elem.getErjishenheren());
			String approveStatus2 = "未审核";
			if (elem.getErji_shenhe_status() == 1) {
				approveStatus2 = "审核通过";
			} else if (elem.getErji_shenhe_status() == 2) {
				approveStatus2 = "审核未通过";
			}
			tmp.add(approveStatus2);
			tmp.add(elem.getErji_shenhe_beizhu());
			String download_file = "<a type='button' class='btn btn-info check' href='/files/image/"+elem.getHetongwenjian()+"'>合同下载</a>";
			tmp.add(download_file);
			String checkButton = "<input type='button' class='btn btn-success check' value='查看' >";
			tmp.add(checkButton);
			retList.add(tmp);
			if (elem.getErji_shenhe_status() == 0 || elem.getYiji_shenhe_status() == 0) {
				count++;
			}
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("unapproved", Integer.toString(count));
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/getAllKaiPiaoQingKuangBiao_FenGongSi")
	@ResponseBody
	public Map<String, String> getAllKaiPiaoQingKuangBiao_FenGongSi(HttpServletRequest request) {
		Long companyId = Long.valueOf(request.getParameter("company_id")); 
		Map<String, String> retMap = new HashMap<>();
		List<KaiPiaoQingKuangBiao_FenGongSi> KaiPiaoQingKuangBiaos = projectService
				.getAllKaiPiaoQingKuangBiao_FenGongSi(companyId);
		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (KaiPiaoQingKuangBiao_FenGongSi elem : KaiPiaoQingKuangBiaos) {
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId().toString());
			tmp.add(elem.getShengqingkaipiaoshijian());
			tmp.add(elem.getBuhanshuijine() == null? "": elem.getBuhanshuijine().toString());
			tmp.add(elem.getShuie() == null ? "":elem.getShuie().toString());
			tmp.add(elem.getHejijine() == null ? "":elem.getHejijine().toString());
			tmp.add(elem.getKaijufapiao() == null ? "":elem.getKaijufapiao().toString());
			tmp.add(elem.getShouqikuanxiang() == null ? "" : elem.getShouqikuanxiang().toString());
			tmp.add(elem.getWangongjindu());
			tmp.add(elem.getQita() == null ? "" :elem.getQita().toString());
			tmp.add(elem.getYikaipiaojine() == null ? "" :elem.getYikaipiaojine().toString());
			tmp.add(elem.getFenbaofapiao() == null ? "" : elem.getFenbaofapiao().toString());
			/*tmp.add("");
			tmp.add(elem.getBeizhu());*/
			tmp.add(elem.getYijishenheren());
			String approveStatus = "未审核";
			if (elem.getYiji_shenhe_status() == 1) {
				approveStatus = "审核通过";
			} else if (elem.getYiji_shenhe_status() == 2) {
				approveStatus = "审核未通过";
			}
			tmp.add(approveStatus);
			tmp.add(elem.getYiji_shenhe_beizhu());
			tmp.add(elem.getErjishenheren());
			String approveStatus2 = "未审核";
			if (elem.getErji_shenhe_status() == 1) {
				approveStatus2 = "审核通过";
			} else if (elem.getErji_shenhe_status() == 2) {
				approveStatus2 = "审核未通过";
			}
			tmp.add(approveStatus2);
			tmp.add(elem.getErji_shenhe_beizhu());
			retList.add(tmp);
			if (elem.getErji_shenhe_status() == 0 || elem.getYiji_shenhe_status() == 0) {
				count++;
			}
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("unapproved", Integer.toString(count));
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/getAllKaiPiaoQingKuangBiao_XiangMu")
	@ResponseBody
	public Map<String, String> getAllKaiPiaoQingKuangBiao_XiangMu(HttpServletRequest request) {
		Integer companyId = Integer.valueOf(request.getParameter("company_id")); 
		Map<String, String> retMap = new HashMap<>();
		List<KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian> KaiPiaoQingKuangBiaos = projectService
				.getKaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJianByCompanyId(companyId);
		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian elem : KaiPiaoQingKuangBiaos) {
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId().toString());
			tmp.add(elem.getShengqingkaipiaoshijian());
			tmp.add(elem.getBeizhu());
			if(("zhuanpiao".equals(elem.getFapiaoleixing()))){
				tmp.add("专用发票");
			}else{
				tmp.add("普通发票");
			}
			tmp.add(elem.getBuhanshuijine() == null? "": elem.getBuhanshuijine().toString());
			tmp.add(elem.getShuie() == null ? "":elem.getShuie().toString());
			tmp.add(elem.getHejijine() == null ? "":elem.getHejijine().toString());
			tmp.add(elem.getKaijufapiao() == null ? "":elem.getKaijufapiao().toString());
			tmp.add(elem.getShouqikuanxiang() == null ? "" : elem.getShouqikuanxiang().toString());
			tmp.add(elem.getWangongjindu());
			tmp.add(elem.getQita() == null ? "" :elem.getQita().toString());
			tmp.add(elem.getFenbaofapiao() == null ? "" : elem.getFenbaofapiao().toString());
			tmp.add(elem.getYikaipiaojine() == null ? "" :elem.getYikaipiaojine().toString());
			tmp.add(elem.getHetongzongjine() == null ? "" : elem.getHetongzongjine().toString());
			Double weikaipiaojine = (elem.getHetongzongjine()==null ? 0.00 : elem.getHetongzongjine()) -(elem.getYikaipiaojine() == null ? 0.00 : elem.getYikaipiaojine());
			tmp.add(weikaipiaojine);
			/*tmp.add(elem.getBeizhu());*/
			tmp.add(elem.getYijishenheren());
			String approveStatus = "未审核";
			if (elem.getYiji_shenhe_status() == 1) {
				approveStatus = "审核通过";
			} else if (elem.getYiji_shenhe_status() == 2) {
				approveStatus = "审核未通过";
			}
			tmp.add(approveStatus);
			tmp.add(elem.getYiji_shenhe_beizhu());
			tmp.add(elem.getErjishenheren());
			String approveStatus2 = "未审核";
			if (elem.getErji_shenhe_status() == 1) {
				approveStatus2 = "审核通过";
			} else if (elem.getErji_shenhe_status() == 2) {
				approveStatus2 = "审核未通过";
			}
			tmp.add(approveStatus2);
			tmp.add(elem.getErji_shenhe_beizhu());
			String download_file = "<a type='button' class='btn btn-info check' href='/files/image/"+elem.getHetongwenjian()+"'>合同下载</a>";
			tmp.add(download_file);
			String checkButton = "<input type='button' class='btn btn-success check'value='查看' >";
			tmp.add(checkButton);
			retList.add(tmp);
			if (elem.getErji_shenhe_status() == 0 || elem.getYiji_shenhe_status() == 0) {
				count++;
			}
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("unapproved", Integer.toString(count));
		retMap.put("status", "ok");
		return retMap;
	}
	

	@RequestMapping("/project/getKaiPiaoQingKuangBiao_XiangMuByUser")
	@ResponseBody
	public Map<String, String> getKaiPiaoQingKuangBiao_XiangMuByUser(HttpServletRequest request,
			HttpSession httpSession) {

		Map<String, String> retMap = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		/*List<Company> companies = projectService.getCompaniesByUid(uid);*/
		List<Company> companies = projectService.getXiangmuCompaniesByUid(uid);
		List<Integer> companyIds = new ArrayList<>();
		List<KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian> KaiPiaoQingKuangBiaos = new ArrayList<>();
		for (Company company : companies) {
			KaiPiaoQingKuangBiaos.addAll(projectService.getKaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJianByCompanyId(company.getId()));

		}
		Integer approvalLevel = 0;
		List<Role> roles = projectService.getUserRoles(uid);
		for (Role role : roles) {
			if (role.getName().contains("一级") || role.getName().contains("业务主任")) {
				approvalLevel = 1;
			} else if (role.getName().contains("二级") || role.getName().contains("分管所长")) {
				approvalLevel = 2;
			}
		}

		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian elem : KaiPiaoQingKuangBiaos) {
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId() == null? "":elem.getId().toString());
			tmp.add(elem.getShengqingkaipiaoshijian());
			tmp.add(elem.getBeizhu());
			if(("zhuanpiao".equals(elem.getFapiaoleixing()))){
				tmp.add("专用发票");
			}else{
				tmp.add("普通发票");
			}
			tmp.add(elem.getBuhanshuijine() == null? "":elem.getBuhanshuijine().toString());
			tmp.add(elem.getShuie() == null ? "":elem.getShuie().toString());
			tmp.add(elem.getHejijine() == null ? "":elem.getHejijine().toString());
			tmp.add(elem.getKaijufapiao() == null ? "":elem.getKaijufapiao().toString());
			tmp.add(elem.getShouqikuanxiang() == null ? "" : elem.getShouqikuanxiang().toString());
			tmp.add(elem.getWangongjindu());
			tmp.add(elem.getQita() == null?"":elem.getQita().toString());
			tmp.add(elem.getYikaipiaojine() == null? "": elem.getYikaipiaojine().toString());
			tmp.add(elem.getHetongzongjine() == null ? "" : elem.getHetongzongjine().toString());
			Double weikaipiaojine = (elem.getHetongzongjine()==null ? 0.00 : elem.getHetongzongjine()) -(elem.getYikaipiaojine() == null ? 0.00 : elem.getYikaipiaojine());
			tmp.add(weikaipiaojine.toString());
			tmp.add(elem.getFenbaofapiao() == null ? "" : elem.getFenbaofapiao().toString());
			tmp.add(elem.getYijishenheren());
			String approveStatus = "未审核";
			if (elem.getYiji_shenhe_status() == 1) {
				approveStatus = "审核通过";
			} else if (elem.getYiji_shenhe_status() == 2) {
				approveStatus = "审核未通过";
			}
			tmp.add(approveStatus);
			tmp.add(elem.getYiji_shenhe_beizhu());
			tmp.add(elem.getErjishenheren());

			String approveStatus2 = "未审核";
			if (elem.getErji_shenhe_status() == 1) {
				approveStatus2 = "审核通过";
			} else if (elem.getErji_shenhe_status() == 2) {
				approveStatus2 = "审核未通过";
			}
			tmp.add(approveStatus2);
			tmp.add(elem.getErji_shenhe_beizhu());
			String download_file = "<a type='button' class='btn btn-info check' href='/files/image/"+elem.getHetongwenjian()+"'>合同下载</a>";
			tmp.add(download_file);
			String approveButton = "<input type='button' class='btn btn-success approve'value='通过' >";
			String rejectButton = "<input type='button' class='btn btn-danger reject' value='拒绝' >";
			String checkButton = "<input type='button' class='btn btn-primary check' value='查看' >";
			tmp.add(checkButton);
			tmp.add(approveButton);
			tmp.add(rejectButton);

			if (approvalLevel == 1 && elem.getYiji_shenhe_status() == 0) {
				count++;
				retList.add(tmp);
			} else if (approvalLevel == 2 && elem.getYiji_shenhe_status() == 1 && elem.getErji_shenhe_status() == 0) {
				count++;
				retList.add(tmp);
			}

		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("count", count.toString());
		// retMap.put("unapproved", Integer.toString(count));
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/getJinXiangFaPiaoMingXi_FaPiaoByCompanyId")
	@ResponseBody
	public Map<String, String> getJinXiangFaPiaoMingXi_FaPiaoByCompanyId(HttpServletRequest request,
			HttpSession httpSession) {

		Map<String, String> retMap = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		List<Company> companies = projectService.getCompaniesByUid(uid);
		List<Integer> companyIds = new ArrayList<>();
		List<JinXiangFaPiaoMingXi_FaPiao> jinxiangkaipiaomingxi_fapiaos = new ArrayList<>();
		for (Company company : companies) {
			jinxiangkaipiaomingxi_fapiaos.addAll(projectService.getJinXiangFaPiaoMingXi_FaPiaoByCompanyId(Long.valueOf(company.getId())));

		}
		Integer approvalLevel = 0;
		List<Role> roles = projectService.getUserRoles(uid);
		for (Role role : roles) {
			if (role.getName().contains("开进项票人") ) {
				approvalLevel = 2;
			} else if (role.getName().contains("业务主任")) {
				approvalLevel = 1;
			}
		}

		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (JinXiangFaPiaoMingXi_FaPiao elem : jinxiangkaipiaomingxi_fapiaos) {
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId().toString());
			tmp.add(elem.getFapiaokaijushijian());
			tmp.add(elem.getFapiaohaoma());
			tmp.add(elem.getXiaohuodanweimingcheng());
			tmp.add(elem.getHuowumingcheng());
			tmp.add(elem.getJine());
			tmp.add(elem.getJinxiangshuie());
			tmp.add(elem.getFp_11_yunshu_jine());
			tmp.add(elem.getFp_11_yunshu_jinxiangshuie());
			tmp.add(elem.getFp_11_dianxin_jine());
			tmp.add(elem.getFp_11_dianxin_jinxiangshuie());
			tmp.add(elem.getFp_11_jianzhu_jine());
			tmp.add(elem.getFp_11_jianzhu_jinxiangshuie());
			tmp.add(elem.getFp_11_budong_jine());
			tmp.add(elem.getFp_11_budong_jinxiangshuie());
			tmp.add(elem.getFp_11_shourang_jine());
			tmp.add(elem.getFp_11_shourang_jinxiangshuie());
			tmp.add(elem.getFp_11_xiaoji_jine());
			tmp.add(elem.getFp_11_xiaoji_jinxiangshuie());
			tmp.add(elem.getFp_17_qita_jine());
			tmp.add(elem.getFp_17_qita_jinxiangshuie());
			tmp.add(elem.getFp_17_youxing_jine());
			tmp.add(elem.getFp_17_youxing_jinxiangshuie());
			tmp.add(elem.getFp_17_xiaoji_jine());
			tmp.add(elem.getFp_17_xiaoji_jinxiangshuie());
			tmp.add(elem.getFp_13_jine());
			tmp.add(elem.getFp_13_jinxiangshuie());
			tmp.add(elem.getFp_6_dianxin_jine());
			tmp.add(elem.getFp_6_dianxin_jinxiangshuie());
			tmp.add(elem.getFp_6_jinrong_jine());
			tmp.add(elem.getFp_6_jinrong_jinxiangshuie());
			tmp.add(elem.getFp_6_shenghuo_jine());
			tmp.add(elem.getFp_6_shenghuo_jinxiangshuie());
			tmp.add(elem.getFp_6_wuxing_jine());
			tmp.add(elem.getFp_6_wuxing_jinxiangshuie());
			tmp.add(elem.getFp_6_xiaoji_jine());
			tmp.add(elem.getFp_6_xiaoji_jinxiangshuie());
			tmp.add(elem.getFp_5_qita_jine());
			tmp.add(elem.getFp_5_qita_jinxiangshuie());
			tmp.add(elem.getFp_5_budong_jine());
			tmp.add(elem.getFp_5_budong_jinxiangshuie());
			tmp.add(elem.getFp_5_xiaoji_jine());
			tmp.add(elem.getFp_5_xiaoji_jinxiangshuie());
			tmp.add(elem.getFp_3_huowu_jine());
			tmp.add(elem.getFp_3_huowu_jinxiangshuie());
			tmp.add(elem.getFp_3_yunshu_jine());
			tmp.add(elem.getFp_3_yunshu_jinxiangshuie());
			tmp.add(elem.getFp_3_dianxin_jine());
			tmp.add(elem.getFp_3_dianxin_jinxiangshuie());
			tmp.add(elem.getFp_3_jianzhu_jine());
			tmp.add(elem.getFp_3_jianzhu_jinxiangshuie());
			tmp.add(elem.getFp_3_jinrong_jine());
			tmp.add(elem.getFp_3_jinrong_jinxiangshuie());
			tmp.add(elem.getFp_3_youxing_jine());
			tmp.add(elem.getFp_3_youxing_jinxiangshuie());
			tmp.add(elem.getFp_3_shenghuo_jine());
			tmp.add(elem.getFp_3_shenghuo_jinxiangshuie());
			tmp.add(elem.getFp_3_wuxing_jine());
			tmp.add(elem.getFp_3_wuxing_jinxiangshuie());
			tmp.add(elem.getFp_3_xiaoji_jine());
			tmp.add(elem.getFp_3_xiaoji_jinxiangshuie());
			tmp.add(elem.getFp_3_2_jine());
			tmp.add(elem.getFp_3_2_jinxiangshuie());
			tmp.add(elem.getFp_yongyu_jine());
			tmp.add(elem.getFp_yongyu_jinxiangshuie());
			tmp.add(elem.getFp_tongxingfei_jine());
			tmp.add(elem.getFp_tongxingfei_jinxiangshuie());
			
			String approveStatus = "未审核";
			if (elem.getYiji_shenhe_status() == 1) {
				approveStatus = "审核通过";
			} else if(elem.getYiji_shenhe_status() == 2){
				approveStatus = "审核未通过";
			}
			if(approvalLevel==2){
				tmp.add(approveStatus);
				tmp.add(elem.getYiji_shenhe_beizhu());
				if(approveStatus.contains("未审核")){
					String editButton = "<input type='button' class='btn btn-success edit' value='编辑' >";
					tmp.add(editButton);
					retList.add(tmp);
					continue;
				}else if(approveStatus.contains("通过")){
					String editButton = "<input type='button' disabled class='btn btn-success edit' value='编辑' >";
					tmp.add(editButton);
					retList.add(tmp);
					continue;
				}
			}else if(approvalLevel == 1){
				if(elem.getYiji_shenhe_status() != 0){
					continue;
				}else if(approveStatus.contains("未审核")){
					String approveButton = "<input type='button' class='btn btn-success approve' value='通过' >";
					String rejectButton = "<input type='button' class='btn btn-danger reject' value='拒绝' >";
					tmp.add(approveButton);
					tmp.add(rejectButton);
					retList.add(tmp);
				}
			}
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("count", count.toString());
		// retMap.put("unapproved", Integer.toString(count));
		retMap.put("status", "ok");
		return retMap;
	}

	@RequestMapping("/project/getOneFromFourProgressType")
	@ResponseBody
	public Map<String, String> getOneFromFourProgressType(HttpServletRequest request){
		Map<String, String> retMap = new HashMap<>();
		String data;
		String type;
		Long kaipiaoshenqingdan_id = Long.valueOf(request.getParameter("kaipiaoshenqingdan_id"));
		List<QueRenShouRuFangShi_LaoWuShiJianZhanBiFa> lwsj= projectService.getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaByKaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		if(!lwsj.isEmpty()){
			data = JSONArray.fromObject(lwsj).toString();
			type = "劳务时间";
		}else{
			List<QueRenShouRuFangShi_QiTa> qt = projectService.getQueRenShouRuFangShi_QiTaByKaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
			if(!qt.isEmpty()){
				data = JSONArray.fromObject(qt).toString();
				type = "其它";
			}else{
				List<QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa> yfscb = projectService.getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
				if(!yfscb.isEmpty()){
					data = JSONArray.fromObject(yfscb).toString();
					type = "已发生成本";
				}else{
					List<QueRenShouRuFangShi_YiWanGongGongZuoLiangFa> ywg = projectService.getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaByKaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
					data = JSONArray.fromObject(ywg).toString();
					type = "已完工";
				}
			}
		}
		retMap.put("data", data);
		retMap.put("type", type);
		return retMap;
	}
	
	@RequestMapping("/project/getOneFromFourInvoiceType")
	@ResponseBody
	public Map<String, String> getOneFromFourInvoiceType(HttpServletRequest request){
		Map<String, String> retMap = new HashMap<>();
		String data;
		String type;
		Long kaipiaoshenqingdan_id = Long.valueOf(request.getParameter("kaipiaoshenqingdan_id"));
		List<PuTongFaPiaoKaiJuMingXi> ptfpkjmx= projectService.getPuTongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		if(!ptfpkjmx.isEmpty()){
			data = JSONArray.fromObject(ptfpkjmx).toString();
			type = "普票";
		}else{
			List<ZhuanYongFaPiaoKaiJuMingXi> zyfpkjmx = projectService.getZhuanYongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
			if(!zyfpkjmx.isEmpty()){
				data = JSONArray.fromObject(zyfpkjmx).toString();
				type = "专票";
			}else{
				List<JianYiJiShuiFangFaPuPiaoJiShui> jyjsffppjs = projectService.getJianYiJiShuiFangFaPuPiaoJiShuiBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
				if(!jyjsffppjs.isEmpty()){
					data = JSONArray.fromObject(jyjsffppjs).toString();
					type = "简易普票";
				}else{
					List<JianYiJiShuiFangFaZhuanPiaoJiShui> jyjsffzp = projectService.getJianYiJiShuiFangFaZhuanPiaoJiShuiBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
					data = JSONArray.fromObject(jyjsffzp).toString();
					type = "简易专票";
				}
			}
		}
		retMap.put("data", data);
		retMap.put("type", type);
		
		return retMap;
	}
	
	
	@RequestMapping("/project/getJinXiangFaPiaoMingXi_RenZhengByCompanyId")
	@ResponseBody
	public Map<String, String> getJinXiangFaPiaoMingXi_RenZhengByCompanyId(HttpServletRequest request,
			HttpSession httpSession) {

		Map<String, String> retMap = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		List<Company> companies = projectService.getCompaniesByUid(uid);
		List<Integer> companyIds = new ArrayList<>();
		List<JinXiangFaPiaoMingXi_RenZheng> jinxiangfapiaomingxi_renzhengs = new ArrayList<>();
		for (Company company : companies) {
			jinxiangfapiaomingxi_renzhengs.addAll(projectService.getJinXiangFaPiaoMingXi_RenZhengByCompanyId(Long.valueOf(company.getId())));

		}
		Integer approvalLevel = 0;
		
		List<Role> roles = projectService.getUserRoles(uid);
		for (Role role : roles) {
			if (role.getName().contains("业务主任")) {
				approvalLevel = 2;
			} else if (role.getName().contains("开进项票人")) {
				approvalLevel = 1;
			}
		}

		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (JinXiangFaPiaoMingXi_RenZheng elem : jinxiangfapiaomingxi_renzhengs) {
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId().toString());
			tmp.add(elem.getHaiguan_kaipiaoriqi());
			tmp.add(elem.getHaiguan_fapiaohaoma());
			tmp.add(elem.getHaiguan_fenshu());
			tmp.add(elem.getHaiguan_jine());
			tmp.add(elem.getHaiguan_shuie());
			tmp.add(elem.getHaiguanjiashuiheji());
			tmp.add(elem.getNongchanpin_kaipiaoriqi());
			tmp.add(elem.getNongchanpin_fapiaohaoma());
			tmp.add(elem.getNongchanpin_fenshu());
			tmp.add(elem.getNongchanpin_jine());
			tmp.add(elem.getNongchanpin_shuie());
			tmp.add(elem.getNongchanpin_jiashuiheji());
			tmp.add(elem.getDaikou_kaipiaoriqi());
			tmp.add(elem.getDaikou_fapiaohaoma());
			tmp.add(elem.getDaikou_fenshu());
			tmp.add(elem.getDaikou_jine());
			tmp.add(elem.getDaikou_shuie());
			tmp.add(elem.getDaikou_jiashuiheji());
			tmp.add(elem.getQita_kaipiaoriqi());
			tmp.add(elem.getQita_fapiaohaoma());
			tmp.add(elem.getQita_fenshu());
			tmp.add(elem.getQita_jine());
			tmp.add(elem.getQita_shuie());
			tmp.add(elem.getQita_jiashuiheji());
			
			String approveStatus = "未审核";
			if (elem.getYiji_shenhe_status() == 1) {
				approveStatus = "审核通过";
			} else if(elem.getYiji_shenhe_status() == 2){
				approveStatus = "审核未通过";
			}
			if(approvalLevel==1){
				tmp.add(approveStatus);
				tmp.add(elem.getYiji_shenhe_beizhu());
				if(approveStatus.contains("未审核")){
					String editButton = "<input type='button' class='btn btn-success edit' value='编辑' >";
					tmp.add(editButton);
					retList.add(tmp);
					continue;
				}else if(approveStatus.contains("通过")){
					String editButton = "<input type='button' disabled class='btn btn-success edit' value='编辑' >";
					tmp.add(editButton);
					retList.add(tmp);
					continue;
				}
			}else if(approvalLevel == 2){
				if(elem.getYiji_shenhe_status() != 0){
					continue;
				}else if(approveStatus.contains("未审核")){
					String approveButton = "<input type='button' class='btn btn-success approve' value='通过' >";
					String rejectButton = "<input type='button' class='btn btn-danger reject' value='拒绝' >";
					tmp.add(approveButton);
					tmp.add(rejectButton);
					retList.add(tmp);
				}
			}
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		retMap.put("count", count.toString());
		retMap.put("status", "ok");
		return retMap;
	}
	
	
	@RequestMapping("/project/sendTelInfo")
	public String sendTelInfo(HttpServletRequest request, HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		//SMSSender.sendTemplateSMS("18601615517");
		return "";
	}
	
	@RequestMapping("/project/updateKaiPiaoQingKuangBiao_XiangMuStatus")
	@ResponseBody
	public Map<String, String> updateKaiPiaoQingKuangBiao_XiangMuStatus(HttpServletRequest request,
			HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		Long id = Long.valueOf(request.getParameter("id"));
		String type = request.getParameter("type");
		String comment = request.getParameter("comment");
		Integer status = Integer.valueOf(request.getParameter("status"));
		//status 1-pass,2-reject
		//type first-1, second-2
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		User user = projectService.getUserById(uid);
		String userName = user.getName();
		KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu = projectService
				.getKaiPiaoQingKuangBiao_XiangMuById(id);
		if (type.equals("first")) {
			kaiPiaoQingKuangBiao_XiangMu.setYiji_shenhe_beizhu(comment);
			kaiPiaoQingKuangBiao_XiangMu.setYiji_shenhe_status(status);
			kaiPiaoQingKuangBiao_XiangMu.setYijishenheren(userName);
			String shenhebeizhu = kaiPiaoQingKuangBiao_XiangMu.getYiji_shenhe_beizhu();
			String yijishenheren = kaiPiaoQingKuangBiao_XiangMu.getSms_yijishenherenxingming();
			if(yijishenheren == null) yijishenheren = "";
			if(shenhebeizhu == null || shenhebeizhu.isEmpty()) shenhebeizhu = "无";
			if(status == 1) {
				String smsInfo = yijishenheren + "审核通过";
				SMSSender.sendTemplateSMS(kaiPiaoQingKuangBiao_XiangMu.getSms_erjishenherendianhua(), "94983", new String[]{smsInfo});
			} else if(status == 2) {
				String smsInfo1 = yijishenheren + "审核拒绝";
				String smsInfo2 = shenhebeizhu;
				String smsInfo3 = "无";
				SMSSender.sendTemplateSMS(kaiPiaoQingKuangBiao_XiangMu.getSms_kaipiaorendianhua(), "94982", new String[]{smsInfo1, smsInfo2, smsInfo3});
			}
		} else if (type.equals("second")) {
			kaiPiaoQingKuangBiao_XiangMu.setErji_shenhe_beizhu(comment);
			kaiPiaoQingKuangBiao_XiangMu.setErji_shenhe_status(status);
			kaiPiaoQingKuangBiao_XiangMu.setErjishenheren(userName);
			
			String shenhebeizhu = kaiPiaoQingKuangBiao_XiangMu.getErji_shenhe_beizhu();
			String erjishenheren = kaiPiaoQingKuangBiao_XiangMu.getSms_erjishenherenxingming();
			if(erjishenheren == null) erjishenheren = "";
			if(shenhebeizhu == null || shenhebeizhu.isEmpty()) shenhebeizhu = "无";
			if(status == 2) {
				String smsInfo1 = erjishenheren + "审核拒绝";
				String smsInfo2 = shenhebeizhu;
				String smsInfo3 = "无";
				SMSSender.sendTemplateSMS(kaiPiaoQingKuangBiao_XiangMu.getSms_kaipiaorendianhua(), "94982", new String[]{smsInfo1, smsInfo2, smsInfo3});
			}
			if(status == 1){
				
				
				//Send Mail
				Long companyId = kaiPiaoQingKuangBiao_XiangMu.getCompany_id();
				List<XiangMuTaiZhang> xmtz = projectService.getXiangMuTaiZhangByCompany_id(companyId);
				KaiPiaoShenQingDan kpsqd = projectService.getKaiPiaoShenQingDanByKaipiaoqingkuangbiao_xiangmu_id(id);
				KaiPiao_PuTongFaPiao kp_ptfp = projectService.getKaiPiao_PuTongFaPiaoByKaipiaoshenqingdan_id(kpsqd.getId());
				
				Company pc = projectService.getParentCompany(companyId);
				List<User> users = projectService.getUsersByCompanyId(pc.getId().longValue());
				User u = projectService.getUserByRoleName(users, "实际开票人");
				SMSSender.sendTemplateSMS(u.getCompany(), "94984", new String[]{"无"});
				String mail = u.getMail();
				String xmtzStr = JSONArray.fromObject(xmtz).toString();
				String kp_ptfpStr = JSONArray.fromObject(kp_ptfp).toString();
				JavaMailService jms = new JavaMailService();
				jms.sendMailOut(mail, "发票审核完成", projectService.generateXiangMuTaiZhangHTML(xmtz.get(0))+projectService.generateFaPiaoMingXiHTML(kp_ptfp), "bbz@bangbangzhang.com");
			}
		}
		projectService.updateKaiPiaoQingKuangBiao_XiangMu(kaiPiaoQingKuangBiao_XiangMu);
		if(type.equals("second") && status == 1) {
			projectService.updateKaiPiaoQingKuangBiao_XiangMuYiKaiPiaoJinE(id);
		}
		return retMap;
	}

	@RequestMapping("/getMenu")
	@ResponseBody
	public Map<String, String> getMenu(HttpServletRequest request, HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		Map<String, List<Map<String, List<String>>>> menu = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);

		List<Map<String, Object>> menus = projectService.getMenu(uid);
		String data = JSONArray.fromObject(menus).toString();
		retMap.put("data", data);

		return retMap;
	}

	public Object setModel(Object model, Map<String, String[]> params, String type) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		for (Entry<String, String[]> entry : params.entrySet()) {

			String methodName = "set" + Character.toUpperCase(entry.getKey().charAt(0)) + entry.getKey().substring(1);
			String arg = entry.getValue()[0];
			if(arg == null){
				continue;
			}

			Method m;
			if (entry.getKey().equals("class_name")) {
				continue;
			}
			if (entry.getKey().equals("id") && type.equals("full")) {
				m = model.getClass().getMethod(methodName, Long.class);
				Object ret = m.invoke(model, Long.valueOf(arg));
				continue;
			}
			if (entry.getKey().indexOf("_id") != -1 && !("parent_id").equals(entry.getKey())) {
				Long argI = Long.valueOf(arg);
				m = model.getClass().getMethod(methodName, Long.class);
				Object ret = m.invoke(model, argI);
				continue;
			}

			try {
				m = model.getClass().getMethod(methodName, String.class);
				Object ret = m.invoke(model, arg);
			} catch (NoSuchMethodException e) {
				try {
					m = model.getClass().getMethod(methodName, Timestamp.class);
					if (!arg.isEmpty()) {
						arg += " 00:00:00";
						Timestamp argT = new Timestamp(System.currentTimeMillis());
						try {
							argT = Timestamp.valueOf(arg);
						} catch(IllegalArgumentException iae) {
							logger.debug(iae.toString());
						}
						// Timestamp argT = new
						// java.sql.Timestamp(parsedDate.getTime());
						Object ret = m.invoke(model, argT);
					} else {
						Timestamp argT = new Timestamp(System.currentTimeMillis());
						// Timestamp argT = new
						// java.sql.Timestamp(parsedDate.getTime());
						m.invoke(model, argT);
					}
				} catch(NoSuchMethodException ee) {
					if(arg == null || arg.isEmpty()) arg = "0";
					try {
						m = model.getClass().getMethod(methodName, Double.class);
						Double argD = Double.valueOf(arg);
						m.invoke(model, argD);
					} catch(NoSuchMethodException eee) {
						try {
							m = model.getClass().getMethod(methodName, Long.class);
							Long argD = Long.valueOf(arg);
							m.invoke(model, argD);
						} catch(NoSuchMethodException eeee) {
							try {
								m = model.getClass().getMethod(methodName, Integer.class);
								Integer argD = Integer.valueOf(arg);
								m.invoke(model, argD);
							} catch(NoSuchMethodException eeeee) {
								
							}
						}
					}
				}
			}

		}
		return model;
	}

	public XiangMuTaiZhang setXiangMuTaiZhangModel(XiangMuTaiZhang xmtz, Map<String, String[]> params)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException {
		for (Entry<String, String[]> entry : params.entrySet()) {

			String methodName = "set" + Character.toUpperCase(entry.getKey().charAt(0)) + entry.getKey().substring(1);
			String arg = entry.getValue()[0];

			Method m;
			if (entry.getKey().equals("id")) {
				continue;
			}
			if (entry.getKey().equals("company_id")) {
				Integer argI = Integer.valueOf(arg);
				m = xmtz.getClass().getMethod(methodName, String.class);
				Object ret = m.invoke(xmtz, argI);
			}
			try {
				m = xmtz.getClass().getMethod(methodName, String.class);
				Object ret = m.invoke(xmtz, arg);
			} catch (NoSuchMethodException e) {
				try {
					Double argD = Double.valueOf(arg);
					m = xmtz.getClass().getMethod(methodName, Double.class);
					Object ret = m.invoke(xmtz, argD);
				} catch (NumberFormatException e2) {

					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					java.util.Date parsedDate;
					try {
						parsedDate = dateFormat.parse(arg);
						Timestamp argT = new java.sql.Timestamp(parsedDate.getTime());
						m = xmtz.getClass().getMethod(methodName, Timestamp.class);
						Object ret = m.invoke(xmtz, argT);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
		return xmtz;
	}
	
	@RequestMapping("/project/addFile")
	@ResponseBody
	public Map<String, String> addFile(@RequestParam MultipartFile file, HttpServletRequest request) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Map<String, String> retMap = new HashMap<>();
		String filePath = "/home/beirun/invoice";
		String fileUnique = getUniqueIdentifier();
		String fileName = file.getOriginalFilename();
		String field_3 = fileUnique + fileName.substring(fileName.lastIndexOf("."));
		String[] data = {field_3};
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(filePath, field_3));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.debug(e.toString());
		}
		
		Map<String, String[]> params = request.getParameterMap();
		params.put("field3", data);
		params.put("wenjian",new String[]{fileName});
		String className = params.get("class_name")[0];
		String longClassName = "com.wisdom.common.model." + className;
		Class<?> c = Class.forName(longClassName);
		Object instance = c.newInstance();
		instance = setModel(instance, params, "partial");
		System.out.println(className);
		Method m = projectService.getClass().getMethod("add" + className, instance.getClass());
		Object ret = m.invoke(projectService, instance);
		retMap.put("status", "ok");
		retMap.put("primary_id", String.valueOf(ret));
		return retMap;
		
	}
	
	private String getUniqueIdentifier() {
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.substring(0, 8) + uuid.substring(9, 13) + uuid.substring(14, 18) + uuid.substring(19, 23)
				+ uuid.substring(24);
		return uuid;
	}
	
	
	@RequestMapping("/project/addKaiPiaoShenQingDan")
	@ResponseBody
	public Map<String, String> addKaiPiaoShenQingDan(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Map<String, String> retMap = new HashMap<>();
		String filePath = "/home/beirun/invoice";
		String fileName = "";
		if(file != null) {
			String fileUnique = getUniqueIdentifier();
			String fileOrignalName = file.getOriginalFilename();
			fileName = fileUnique + fileOrignalName.substring(fileOrignalName.lastIndexOf("."));
			try {
				FileUtils.copyInputStreamToFile(file.getInputStream(), new File(filePath, fileName));
			} catch (IOException e) {
				logger.debug(e.toString());
			}
		}
		Map<String, String[]> params = request.getParameterMap();
		params.put("fapiaowenjian", new String[]{fileName});
		String longClassName = "com.wisdom.common.model.KaiPiaoShenQingDan";
		Class<?> c = Class.forName(longClassName);
		Object instance = c.newInstance();
		instance = setModel(instance, params, "partial");
		Method m = projectService.getClass().getMethod("addKaiPiaoShenQingDan", instance.getClass());
		Object ret = m.invoke(projectService, instance);
		retMap.put("status", "ok");
		retMap.put("primary_id", String.valueOf(ret));
		return retMap;
	}
	
	@RequestMapping("/project/updateKaiPiaoShenQingDan")
	@ResponseBody
	public Map<String, String> updateKaiPiaoShenQingDan(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Map<String, String> retMap = new HashMap<>();
		String filePath = "/home/beirun/invoice";
		String fileName = "";
		if(file != null) {
			String fileUnique = getUniqueIdentifier();
			String fileOrignalName = file.getOriginalFilename();
			fileName = fileUnique + fileOrignalName.substring(fileOrignalName.lastIndexOf("."));
			try {
				FileUtils.copyInputStreamToFile(file.getInputStream(), new File(filePath, fileName));
			} catch (IOException e) {
				logger.debug(e.toString());
			}
		}
		Integer id = Integer.valueOf(request.getParameter("id"));
		Map<String, String[]> params = request.getParameterMap();
		params.put("fapiaowenjian", new String[]{fileName});
		String className = params.get("class_name")[0];
		Method m = projectService.getClass().getMethod("get" + className + "ById", Long.class);
		Object instance = m.invoke(projectService, Long.valueOf(id));
		//String longClassName = "com.wisdom.common.model." + className;
		//Class c = Class.forName(longClassName);
		//Object instance = c.newInstance();
		instance = setModel(instance, params, "full");
		Method m2 = projectService.getClass().getMethod("update" + className, instance.getClass());
		Object ret = m2.invoke(projectService, instance);
		retMap.put("status", "ok");
		retMap.put("primary_id", String.valueOf(ret));
		return retMap;
	}
	
	@RequestMapping("/project/updateXiangMuTaiZhangWithFile")
	@ResponseBody
	public Map<String, String> updateXiangMuTaiZhangWithFile(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Map<String, String> retMap = new HashMap<>();
		String filePath = "/home/beirun/invoice";
		String fileName = "";
		if(file != null) {
			String fileUnique = getUniqueIdentifier();
			String fileOrignalName = file.getOriginalFilename();
			fileName = fileUnique + fileOrignalName.substring(fileOrignalName.lastIndexOf("."));
			try {
				FileUtils.copyInputStreamToFile(file.getInputStream(), new File(filePath, fileName));
			} catch (IOException e) {
				logger.debug(e.toString());
			}
		}
		Integer id = Integer.valueOf(request.getParameter("id"));
		Integer company_id = Integer.valueOf(request.getParameter("company_id"));
		Map<String, String[]> params = request.getParameterMap();
		params.put("hetongwenjian", new String[]{fileName});
		Method m = projectService.getClass().getMethod("getXiangMuTaiZhangById", Long.class);
		Object instance = m.invoke(projectService, Long.valueOf(id));
		instance = setModel(instance, params, "full");
		Method m2 = projectService.getClass().getMethod("updateXiangMuTaiZhang", instance.getClass());
		m2.invoke(projectService, instance);
		
		projectService.updateCompanyName(request.getParameter("xiangmumingcheng"), company_id);
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/updateXiangMuTaiZhangWithoutFile")
	@ResponseBody
	public Map<String, String> updateXiangMuTaiZhangWithoutFile(HttpServletRequest request) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Map<String, String> retMap = new HashMap<>();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Integer company_id = Integer.valueOf(request.getParameter("company_id"));
		Map<String, String[]> params = request.getParameterMap();
		String className = params.get("class_name")[0];
		Method m = projectService.getClass().getMethod("get" + className + "ById", Long.class);
		Object instance = m.invoke(projectService, Long.valueOf(id));
		instance = setModel(instance, params, "full");
		Method m2 = projectService.getClass().getMethod("update" + className, instance.getClass());
		m2.invoke(projectService, instance);		
		projectService.updateCompanyName(request.getParameter("xiangmumingcheng"), company_id);
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/addXiangMuTaiZhang")
	@ResponseBody
	public Map<String, String> addXiangMuTaiZhangWithFile(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, HttpSession httpSession) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Map<String, String> retMap = new HashMap<>();
		String filePath = "/home/beirun/invoice";
		String fileName = "";
		if(file != null) {
			String fileUnique = getUniqueIdentifier();
			String fileOrignalName = file.getOriginalFilename();
			fileName = fileUnique + fileOrignalName.substring(fileOrignalName.lastIndexOf("."));
			try {
				FileUtils.copyInputStreamToFile(file.getInputStream(), new File(filePath, fileName));
			} catch (IOException e) {
				logger.debug(e.toString());
			}
		}		
		Map<String, String[]> params = new HashMap<>();
		params.put("name", request.getParameterValues("xiangmumingcheng"));
		params.put("parent_id", request.getParameterValues("company_id"));
		params.put("level", new String[]{"2"});
		params.put("create_time", new String[]{new Timestamp(System.currentTimeMillis()).toString().substring(0, 10)});
		String longClassName = "com.wisdom.common.model.Company";
		Class<?> c = Class.forName(longClassName);
		Object instance = c.newInstance();
		instance = setModel(instance, params, "partial");
		Method m = projectService.getClass().getMethod("addXiangMuCompany", instance.getClass());
		Object compnyRet = m.invoke(projectService, instance);
		
		params = request.getParameterMap();
		params.put("hetongwenjian", new String[]{fileName});
		params.put("company_id", new String[]{String.valueOf(compnyRet)});
		longClassName = "com.wisdom.common.model.XiangMuTaiZhang";
		c = Class.forName(longClassName);
		instance = c.newInstance();
		instance = setModel(instance, params, "partial");
		m = projectService.getClass().getMethod("addXiangMuTaiZhang", instance.getClass());
		m.invoke(projectService, instance);
		
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		longClassName = "com.wisdom.common.model.User_Company";
		instance = new User_Company();
		User_Company uc = (User_Company)instance;
		uc.setCompany_id((Integer)compnyRet);
		uc.setUser_id(uid);
		m = projectService.getClass().getMethod("addUser_Company", instance.getClass());
		m.invoke(projectService, instance);
		
		retMap.put("status", "ok");
		retMap.put("primary_id", String.valueOf(compnyRet));
		return retMap;
	}
	
	@RequestMapping("/project/getUsers")
	@ResponseBody
	public Map<String, String> getUsers(HttpServletRequest request,
			HttpSession httpSession) {
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);

		Long companyId = Long.valueOf(request.getParameter("company_id"));
		Map<String, User> Users = projectService.getUsers(companyId, uid);
		String data = JSONArray.fromObject(Users).toString();
		Map<String, String> retMap = new HashMap<>();
		retMap.put("data", data);
		return retMap;
		
	}
	
	@RequestMapping("/project/addKaiPiaoQingKuangBiao_XiangMu")
	@ResponseBody
	public Map<String, String> addKaiPiaoQingKuangBiao_XiangMu(HttpServletRequest request,
			HttpSession httpSession)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException,
			InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException {
		Map<String, String> retMap = new HashMap<>();
		Map<String, String[]> reqParams = request.getParameterMap();
		Map<String, String[]> params = new HashMap<>();
		params.putAll(reqParams);
		
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		Long companyId = Long.valueOf(request.getParameter("company_id"));
		Map<String, User> Users = projectService.getUsers(companyId, uid);
		params.put("sms_kaipiaorendianhua", new String[]{Users.get("kaipiaoren")==null?"":Users.get("kaipiaoren").getCompany()});
		params.put("sms_yijishenherendianhua", new String[]{Users.get("yewuzhuren")==null?"":Users.get("yewuzhuren").getCompany()});
		params.put("sms_erjishenherendianhua", new String[]{Users.get("fenguansuozhang")==null?"":Users.get("fenguansuozhang").getCompany()});
		params.put("sms_kaipiaorenxingming", new String[]{Users.get("kaipiaoren")==null?"":Users.get("kaipiaoren").getName()});
		params.put("sms_yijishenherenxingming", new String[]{Users.get("yewuzhuren")==null?"":Users.get("yewuzhuren").getName()});
		params.put("sms_erjishenherenxingming", new String[]{Users.get("fenguansuozhang")==null?"":Users.get("fenguansuozhang").getName()});
		params.put("yijishenheren", new String[]{Users.get("yewuzhuren")==null?"":Users.get("yewuzhuren").getName()});
		params.put("erjishenheren", new String[]{Users.get("fenguansuozhang")==null?"":Users.get("fenguansuozhang").getName()});
		params.put("yikaipiaojine", new String[]{"0"});
		
		String longClassName = "com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu";
		Class<?> c = Class.forName(longClassName);
		Object instance = c.newInstance();
		instance = setModel(instance, params, "partial");
		Method m = projectService.getClass().getMethod("addKaiPiaoQingKuangBiao_XiangMu", instance.getClass());
		Object ret = m.invoke(projectService, instance);
		if(String.valueOf(ret) != null && !String.valueOf(ret).isEmpty()) {
			SMSSender.sendTemplateSMS(Users.get("yewuzhuren")==null?"":Users.get("yewuzhuren").getCompany(), "94983", new String[]{"提交人-" + Users.get("kaipiaoren")==null?"":Users.get("kaipiaoren").getName()});
		}
		retMap.put("status", "ok");
		retMap.put("primary_id", String.valueOf(ret));
		projectService.updateKaiPiaoQingKuangBiao_XiangMuYiKaiPiaoJinEAtAdd((Long)ret);
		return retMap;
	}
}
