package com.wisdom.web.api.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wisdom.common.mapper.KaiPiaoQingKuangBiao_ZongGongSiMapper;
import com.wisdom.common.model.Company;
import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.JianYiJiShuiFangFaZhuanPiaoJiShui;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_FaPiao;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_RenZheng;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_FenGongSi;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_ZongGongSi;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.Permission;
import com.wisdom.common.model.PuTongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.QueRenShouRuFangShi_LaoWuShiJianZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_QiTa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiWanGongGongZuoLiangFa;
import com.wisdom.common.model.Role;
import com.wisdom.common.model.User;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.ZhuanYongFaPiaoKaiJuMingXi;
import com.wisdom.permission.service.IPermissionService;
import com.wisdom.project.service.IProjectService;
import com.wisdom.user.service.IUserService;
import com.wisdom.utils.SessionConstant;

import net.sf.json.JSONArray;

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
		Class c = Class.forName(longClassName);
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
		String longClassName = "com.wisdom.common.model." + className;
		Class c = Class.forName(longClassName);
		Object instance = c.newInstance();
		instance = setModel(instance, params, "full");
		Method m = projectService.getClass().getMethod("update" + className, instance.getClass());
		Object ret = m.invoke(projectService, instance);
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

	@SuppressWarnings("unchecked")
	@RequestMapping("/project/getModel")
	@ResponseBody
	public Map<String, String> getModel(HttpServletRequest request)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException {
		Map<String, String> retMap = new HashMap<>();
		Map<String, String[]> params = request.getParameterMap();
		String className = params.get("class_name")[0];
		String longClassName = "com.wisdom.common.model." + className;
		Class classType = Class.forName(longClassName);
		String queryKey = params.get("query_key")[0];
		String queryValue = params.get("query_value")[0];
		queryKey = queryKey.substring(0, 1).toUpperCase() + queryKey.substring(1);
		Object ret;
		if (isInteger(queryValue)) {
			if (("Xiangmutaizhang_id").equals(queryKey)) {
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
		Map<String, String[]>  map = request.getParameterMap();
		String param = "";
		if(map != null) {
			int index = 0;
			for(Entry<String, String[]> entry : map.entrySet()) {
				if(("view").equals(entry.getKey())) continue;
				if(index == 0)
					try {
						param += entry.getKey() + "=" + URLEncoder.encode(entry.getValue()[0],"UTF-8");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				else
					try {
						param += "&" + entry.getKey() + "=" + URLEncoder.encode(entry.getValue()[0], "UTF-8");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				index++;
			}
		}
		String view = request.getParameter("view");
		return "redirect:/views/recordviews/" + view + "?" + param;
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
		List<Company> companies = projectService.getCompaniesByUid(uid);
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
	public Map<String, String> getAllKaiPiaoQingKuangBiao_ZongGongSi(HttpServletRequest request) {

		Map<String, String> retMap = new HashMap<>();
		Long companyId = Long.valueOf(request.getParameter("company_id")); 
		List<KaiPiaoQingKuangBiao_ZongGongSi> KaiPiaoQingKuangBiaos = projectService
				.getAllKaiPiaoQingKuangBiao_ZongGongSi(companyId);
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
			tmp.add(elem.getBeizhu());
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
			//tmp.add(elem.getFenbaofapiao() == null ? "" : elem.getFenbaofapiao().toString());
			tmp.add("");
			tmp.add(elem.getBeizhu());
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
		Long companyId = Long.valueOf(request.getParameter("company_id")); 
		Map<String, String> retMap = new HashMap<>();
		List<KaiPiaoQingKuangBiao_XiangMu> KaiPiaoQingKuangBiaos = projectService
				.getAllKaiPiaoQingKuangBiao_XiangMu(companyId);
		List<List<Object>> retList = new ArrayList<>();
		Integer count = 0;
		for (KaiPiaoQingKuangBiao_XiangMu elem : KaiPiaoQingKuangBiaos) {
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
			tmp.add(elem.getBeizhu());
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
	

	@RequestMapping("/project/getKaiPiaoQingKuangBiao_XiangMuByUser")
	@ResponseBody
	public Map<String, String> getKaiPiaoQingKuangBiao_XiangMuByUser(HttpServletRequest request,
			HttpSession httpSession) {

		Map<String, String> retMap = new HashMap<>();
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		List<Company> companies = projectService.getCompaniesByUid(uid);
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
			List<Object> tmp = new ArrayList<>();
			tmp.add(elem.getId() == null? "":elem.getId().toString());
			tmp.add(elem.getShengqingkaipiaoshijian());
			tmp.add(elem.getBuhanshuijine() == null? "":elem.getBuhanshuijine().toString());
			tmp.add(elem.getShuie() == null ? "":elem.getShuie().toString());
			tmp.add(elem.getHejijine() == null ? "":elem.getHejijine().toString());
			tmp.add(elem.getKaijufapiao() == null ? "":elem.getKaijufapiao().toString());
			tmp.add(elem.getShouqikuanxiang() == null ? "" : elem.getShouqikuanxiang().toString());
			tmp.add(elem.getWangongjindu());
			tmp.add(elem.getQita() == null?"":elem.getQita().toString());
			tmp.add(elem.getYikaipiaojine() == null? "": elem.getYikaipiaojine().toString());
			tmp.add(elem.getFenbaofapiao() == null ? "" : elem.getFenbaofapiao().toString());
			tmp.add(elem.getBeizhu());
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
	
	@RequestMapping("/project/updateKaiPiaoQingKuangBiao_XiangMuStatus")
	@ResponseBody
	public Map<String, String> updateKaiPiaoQingKuangBiao_XiangMuStatus(HttpServletRequest request,
			HttpSession httpSession) {
		Map<String, String> retMap = new HashMap<>();
		Long id = Long.valueOf(request.getParameter("id"));
		String type = request.getParameter("type");
		String comment = request.getParameter("comment");
		Integer status = Integer.valueOf(request.getParameter("status"));
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		User user = projectService.getUserById(uid);
		String userName = user.getName();

		KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu = projectService
				.getKaiPiaoQingKuangBiao_XiangMuById(id);
		KaiPiaoQingKuangBiao_FenGongSi kaiPiaoQingKuangBiao_FenGongSi = projectService
				.getKaiPiaoQingKuangBiao_FenGongSiById(id);
		KaiPiaoQingKuangBiao_ZongGongSi kaiPiaoQingKuangBiao_ZongGongSi = projectService
				.getKaiPiaoQingKuangBiao_ZongGongSiById(id);

		if (type.equals("first")) {
			kaiPiaoQingKuangBiao_XiangMu.setYiji_shenhe_beizhu(comment);
			kaiPiaoQingKuangBiao_XiangMu.setYiji_shenhe_status(status);
			kaiPiaoQingKuangBiao_XiangMu.setYijishenheren(userName);
			kaiPiaoQingKuangBiao_FenGongSi.setYiji_shenhe_beizhu(comment);
			kaiPiaoQingKuangBiao_FenGongSi.setYiji_shenhe_status(status);
			kaiPiaoQingKuangBiao_FenGongSi.setYijishenheren(userName);
			kaiPiaoQingKuangBiao_ZongGongSi.setYiji_shenhe_beizhu(comment);
			kaiPiaoQingKuangBiao_ZongGongSi.setYiji_shenhe_status(status);
			kaiPiaoQingKuangBiao_ZongGongSi.setYijishenheren(userName);
		} else if (type.equals("second")) {
			kaiPiaoQingKuangBiao_XiangMu.setErji_shenhe_beizhu(comment);
			kaiPiaoQingKuangBiao_XiangMu.setErji_shenhe_status(status);
			kaiPiaoQingKuangBiao_XiangMu.setErjishenheren(userName);
			kaiPiaoQingKuangBiao_FenGongSi.setErji_shenhe_beizhu(comment);
			kaiPiaoQingKuangBiao_FenGongSi.setErji_shenhe_status(status);
			kaiPiaoQingKuangBiao_FenGongSi.setErjishenheren(userName);
			kaiPiaoQingKuangBiao_ZongGongSi.setErji_shenhe_beizhu(comment);
			kaiPiaoQingKuangBiao_ZongGongSi.setErji_shenhe_status(status);
			kaiPiaoQingKuangBiao_ZongGongSi.setErjishenheren(userName);
		}
		projectService.updateKaiPiaoQingKuangBiao_XiangMu(kaiPiaoQingKuangBiao_XiangMu);
		projectService.updateKaiPiaoQingKuangBiao_FenGongSi(kaiPiaoQingKuangBiao_FenGongSi);
		projectService.updateKaiPiaoQingKuangBiao_ZongGongSi(kaiPiaoQingKuangBiao_ZongGongSi);
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

			Method m;
			if (entry.getKey().equals("class_name")) {
				continue;
			}
			if (entry.getKey().equals("id") && type.equals("full")) {
				m = model.getClass().getMethod(methodName, Long.class);
				Object ret = m.invoke(model, Long.valueOf(arg));
				continue;
			}
			if (entry.getKey().indexOf("_id") != -1) {
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
						Timestamp argT = Timestamp.valueOf(arg);
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
}
