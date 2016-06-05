package com.wisdom.web.api.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.Permission;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.permission.service.IPermissionService;
import com.wisdom.project.service.IProjectService;
import com.wisdom.user.service.IUserService;
import com.wisdom.utils.SessionConstant;

import net.sf.json.JSONArray;

import java.lang.NumberFormatException;

@Controller
public class ProjectController {

	@Autowired IProjectService projectService;
	
	@Autowired IUserService userService;
	
	private static final Logger logger = LoggerFactory
			.getLogger(ProjectController.class);
	
	@RequestMapping("/project/addProject")
	@ResponseBody
	public Map<String, String> addProject(HttpServletRequest request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,SecurityException, NoSuchMethodException{
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
	public Map<String, String> addModel(HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException{
		Map<String, String> retMap = new HashMap<>();
		Map<String, String[]> params = request.getParameterMap();
		String className = params.get("class_name")[0];
		String longClassName = "com.wisdom.common.model." + className;
		Class c = Class.forName(longClassName);
		Object instance = c.newInstance();
		instance = setModel(instance, params, 0);
  	    Method m = projectService.getClass().getMethod("add"+className, instance.getClass());
			Object ret = m.invoke(projectService, instance);
			retMap.put("status", "ok");
			return retMap;			
	}
	
	@RequestMapping("/project/modifyModel")
	@ResponseBody
	public Map<String, String> ModifyModelById(HttpServletRequest request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
		Map<String, String> retMap = new HashMap<>();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Map<String, String[]> params = request.getParameterMap();
		String className = params.get("class_name")[0];
		String longClassName = "com.wisdom.common.model." + className;
		Class c = Class.forName(longClassName);
		Object instance = c.newInstance();
		instance = setModel(instance, params, 1);
		Method m = projectService.getClass().getMethod("update"+className, instance.getClass());
		Object ret = m.invoke(projectService, instance);
		retMap.put("status", "ok");
		return retMap;			
	}
	
	public  boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	@RequestMapping("/project/getModel")
	@ResponseBody
	public Map<String, String> getModel(HttpServletRequest request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
		Map<String, String> retMap = new HashMap<>();
		Map<String, String[]> params = request.getParameterMap();
		String className = params.get("class_name")[0];
		String longClassName = "com.wisdom.common.model." + className;
		String queryKey = params.get("query_key")[0];
		String queryValue = params.get("query_value")[0];
		queryKey = queryKey.substring(0, 1).toUpperCase() + queryKey.substring(1);
		Object ret;
		if(isInteger(queryValue)){
			Method m = projectService.getClass().getMethod("get"+className+"By"+queryKey, Long.class);
			 ret = m.invoke(projectService, Long.valueOf(queryValue));
		}else{
			Method m = projectService.getClass().getMethod("get"+className+"By"+queryKey, String.class);
			ret = m.invoke(projectService, queryValue);
		}
		
		
		String data = JSONArray.fromObject(ret).toString();
		retMap.put("data", data);
		retMap.put("status", "ok");
		return retMap;			
		
	}
	
	
	@RequestMapping("/project/approveProject")
	@ResponseBody
	public Map<String, String> approveProject(HttpServletRequest request){
		Map<String, String> retMap = new HashMap<>();
		String projectId = request.getParameter("project_id");
		String approvalName = request.getParameter("approval_name");
		String status = request.getParameter("status");
		String type = request.getParameter("type");
		System.out.println("Prject Id: " + projectId + " approvalName: " + approvalName + " status: " + status + " type: " + type);
		retMap.put("status", "ok");
		return retMap;
	}
	
	@RequestMapping("/project/getProjectsByCompanyId")
	@ResponseBody
	public Map<String, String> getProjectsByCompanyId(HttpServletRequest request, HttpSession httpSession){
		Map<String, String> retMap = new HashMap<>();
		Integer companyId = Integer.valueOf(request.getParameter("company_id"));

		List<XiangMuTaiZhang> projects = projectService.getProjectsByCompanyId(companyId);
		List<Object> retList = new ArrayList<>();
		for(XiangMuTaiZhang project: projects){
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
	public Map<String, String> getKaiPiaoShenQingDanByProjectId(HttpServletRequest request, HttpSession httpSession){
		Map<String, String> retMap = new HashMap<>();
		Long projectId = Long.valueOf(request.getParameter("kaipiaoqingkuangbiao_xiangmu_id"));
		List<KaiPiaoShenQingDan> kpsqdList = projectService.getKaiPiaoShenQingDanByProjectId(projectId);
		List<Object> retList = new ArrayList<>();
		for(KaiPiaoShenQingDan kpsqd: kpsqdList){
			List<Object> tmpList = new ArrayList<>();
			tmpList.add(kpsqd.getId());
			tmpList.add(kpsqd.getKaipiaoneirong());
			retList.add(tmpList);
			
		}
		String data = JSONArray.fromObject(retList).toString();
		retMap.put("data", data);
		return retMap;
	}

	@RequestMapping("/project/getAllProjectsForUser")
	@ResponseBody
	public Map<String, String> getAllProjectsForUser(HttpServletRequest request, HttpSession httpSession){
		Integer uid = (Integer) httpSession.getAttribute(SessionConstant.SESSION_USER_ID);
		List<List<String>> retList = new ArrayList<>();
		Map<String, String> retMap = new HashMap<>();
		List<String> tmpList = new ArrayList<>();
		tmpList.add("1");
		tmpList.add("description");
		tmpList.add("submitter");
		tmpList.add("update time");
		tmpList.add("status");
		//开票方可编辑
		tmpList.add("<a href='/views/recordviews/edit.html?id=1'>编辑</a>");
		retList.add(tmpList);
		
		tmpList = new ArrayList<>();
		tmpList.add("2");
		tmpList.add("description2");
		tmpList.add("submitter2");
		tmpList.add("update time2");
		tmpList.add("status2");
		//审核方可查看
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
		Map<String,Object> props = m.convertValue(xmtz, Map.class);
		XiangMuTaiZhang anotherBean = (XiangMuTaiZhang) m.convertValue(props, XiangMuTaiZhang.class);
		return props;
		
	}
	
	@RequestMapping("/project/modifyProject")
	@ResponseBody
	public Map<String, String> updateProjectById(HttpServletRequest request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
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
	public Map<String, String> getXiangMuTaiZhangHTML(HttpServletRequest request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String type = request.getParameter("type");
		String html = "";
		Map<String, String> retMap = new HashMap<>();
		
		if (type.equals("create")){
			html="<table width='1333' border='0' cellpadding='0' cellspacing='0' style='width:666.50pt;border-collapse:collapse;table-layout:fixed;'> <tr height='42' style='height:21.00pt;'>      <td class='xl65' height='42' width='1333' colspan='10' style='height:21.00pt;width:666.50pt;border-right:none;border-bottom:none;' x:str>项 目 台 账</td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl66' height='28' colspan='2' style='text-align:left;height:14.00pt;border-right:none;border-bottom:none;' x:str>分公司名称：</td>      <td class='xl66' height='28' colspan='3' style='height:14.00pt;border-right:none;border-bottom:none;' x:str id='fengongsimingcheng'></td>      <td class='xl67' colspan='2' style='border-right:none;border-bottom:none;' x:str>项目部：</td>     <td class='xl67' colspan='3' style='border-right:none;border-bottom:none;' x:str id='xiangmubu'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl68' height='28' colspan='10' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>甲方基本信息情况表</td>    </tr>    <tr height='28' style='height:14.00pt;'>     <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>单位名称</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str ><input style='width:100%;' id='danweimingcheng'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>法定代表人、联系电话</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='fadingdaibiaoren_lianxidianhua'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>纳税人识别号</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='nashuirenshibiehao'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>开户银行、银行账号</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='kaihuyinhang_yinhangzhanghao'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>单位地址、联系电话<span style='mso-spacerun:yes;'>&nbsp;</span></td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='danweidizhi_lianxidianhua'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>项目名称</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='xiangmumingcheng'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>项目负责人、联系电话</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='xiangmufuzeren_lianxidianhua'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>合同类型</td>      <td class='xl70' colspan='8' style='text-align:left;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>     <form id='hetongleixing' style='height:20px;line-height:20px;'>            <input type='radio' name='hetongleixing_select' value='baogongbaoliao'> 包工包料           <input type='radio' name='hetongleixing_select' value='qingbaogong'> 清包工            <input type='radio' name='hetongleixing_select' value='jiagongcai'> 甲供材         <input type='radio' name='hetongleixing_select' value='qita'>其他      </form>  </td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>税率</td>      <td class='xl70' colspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='shuilv'></td>      <td class='xl70' x:str>征收率</td>      <td class='xl70' colspan='4' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='zhengshoulv'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>合同金额</td>      <td class='xl70' x:str>不含税金额</td>      <td class='xl70' id=''><input style='width:100%;' id='buhanshuijine'></td>      <td class='xl70' x:str>税额</td>      <td class='xl70' id=''><input style='width:100%;' id='shuie'></td>      <td class='xl70'></td>      <td class='xl70'></td>      <td class='xl70' x:str>合计金额</td>      <td class='xl70' id=''><input style='width:100%;' id='hejijine'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>决算金额</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='juesuanjine'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>预计合同总成本</td>      <td class='xl70' colspan='8' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='yujihetongzongchengben'></td>     </tr>     <tr height='56' style='height:28.00pt;'>      <td class='xl69' height='56' colspan='2' style='height:28.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>合同签订时间</td>      <td class='xl70' colspan='2' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='hetongqiandingshijian'></td>      <td class='xl71' x:str>合同开工时间</td>      <td class='xl71' id=''><input style='width:100%;' id='hetongkaigongshijian'></td>      <td class='xl71' x:str>开工许可证时间</td>      <td class='xl71' id=''><input style='width:100%;' id='kaigongxukezhengshijian'></td>      <td class='xl71' x:str>预计完工时间</td>      <td class='xl71' id=''><input style='width:100%;' id='yujiwangongshijian'></td>     </tr>     <tr height='28' style='height:14.00pt;'>      <td class='xl69' height='28' colspan='2' style='height:14.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>合同付款方式</td>      <td class='xl70' colspan='8' style='text-align:left;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>     <form id='hetongfukuanfangshi' style='height:20px;line-height:20px;'>          <input type='radio' name='hetongfukuanfangshi_select' value='yicixingfukuan'>一次性付款            <input type='radio' name='hetongfukuanfangshi_select' value='qingbaogong'>完工进度         <input type='radio' name='hetongfukuanfangshi_select' value='jiagongcai'>其它      </form>    </td>     </tr>    </table><input id='create-xiangmutaizhang' type='button' value='创建'/>";
			retMap.put("data", html);
		}
		retMap.put("status", "ok");

		return retMap;
		
	}
	
	@RequestMapping("/project/getKaiPiaoShenQingDanHTML")
	@ResponseBody
	public Map<String, String> getKaiPiaoShenQingDanHTML(HttpServletRequest request){
		String type = request.getParameter("type");
		String html = "";
		Map<String, String> retMap = new HashMap<>();
		if(type.equals("create")){
			html = "  <table width='1097' border='0' cellpadding='0' cellspacing='0' style='width:548.50pt;border-collapse:collapse;table-layout:fixed;'>  <tr height='35' style='height:17.50pt;'>    <td class='xl65' height='35' width='1097' colspan='6' style='height:17.50pt;width:548.50pt;border-right:none;border-bottom:none;' x:str>开票申请单</td>   </tr>   <tr height='28' style='height:14.00pt;'>    <td class='xl66' height='28' style='height:14.00pt;' x:str>分公司名称：</td>    <td class='xl66' id='fengongsimingcheng'></td>    <td class='xl67' colspan='2' style='border-right:none;border-bottom:.5pt solid windowtext;'></td>    <td class='xl66' x:str>项目部：</td>    <td class='xl66' id='xiangmubu'></td>   </tr>   <tr height='28' style='height:14.00pt;'>    <td class='xl68' height='28' style='height:14.00pt;' x:str>项目名称</td>    <td class='xl69' colspan='2' style='border-right:none;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='xiangmumingcheng'></td>    <td class='xl71' x:str>合同总金额</td>    <td class='xl71' colspan='2' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' id=''><input style='width:100%;' id='hetongzongjine'></td>   </tr>   <tr height='28' style='height:14.00pt;'>    <td class='xl73' height='112' rowspan='4' style='height:56.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>申请日期</td>    <td class='xl74' rowspan='4' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>开票内容</td>    <td class='xl75' colspan='4' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>申请开票金额 （含税）</td>   </tr>   <tr height='28' style='height:14.00pt;'>    <td class='xl79' rowspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>开具发票</td>    <td class='xl80' rowspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>收讫款项</td>    <td class='xl73' rowspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>完工进度</td>    <td class='xl73' rowspan='3' style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:str>其他</td>   </tr>   <tr height='28' style='height:14.00pt;'/>   <tr height='28' style='height:14.00pt;'/>   <tr height='28' style='height:14.00pt;'>    <td class='xl87' height='28' style='height:14.00pt;' id='shenqingriqi'><input style='width:100%;' id='shenqingriqi'></td>    <td class='xl87' id='kaipiaoneirong'><input style='width:100%;' id='kaipiaoneirong'></td>    <td class='xl87' id='kaijufapiao'><input style='width:100%;' id='kaijufapiao'></td>    <td class='xl87' id='shouqikuanxiang'><input style='width:100%;' id='shouqikuanxiang'></td>    <td class='xl87' id='wangongjindu'><input style='width:100%;' id='wangongjindu'></td>    <td class='xl87' id='qita'><input style='width:100%;' id='qita'></td>   </tr>  </table>";
			retMap.put("data", html);
		}
		retMap.put("status", "ok");
		return retMap;
	}
		
	@RequestMapping("/getMenu")
	@ResponseBody
	public Map<String, String> getMenu(HttpServletRequest request){
		Map<String, String> retMap = new HashMap<>();
		Map<String, List<Map<String, List<String>>>> menu = new HashMap<>();
		/*Integer companyId = Integer.valueOf(request.getParameter("company_id"));
		
		List<XiangMuTaiZhang> projects = projectService.getProjectsByCompanyId(companyId);
		List<String> projectNames = new ArrayList<>();
		for(XiangMuTaiZhang project: projects){
			projectNames.add(project.getXiangmumingcheng());
		}
		String data = JSONArray.fromObject(projectNames).toString();*/
		
		List<Map<String, Object>> menus = projectService.getMenu();
		String data = JSONArray.fromObject(menus).toString();
		retMap.put("data", data);
		
		return retMap;
	}
	
	
	public Object setModel(Object model, Map<String, String[]> params, int type) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		for (Entry<String, String[]> entry : params.entrySet()) {
			
			String methodName = "set" + Character.toUpperCase(entry.getKey().charAt(0)) + entry.getKey().substring(1);
			String arg = entry.getValue()[0];

		      Method m;
		      if(type==0 && entry.getKey().equals("id") || entry.getKey().equals("class_name")){
		    	  continue;
		      }
		      if(entry.getKey().indexOf("_id") != -1 || entry.getKey().equals("id")){
		    	  Long argI = Long.valueOf(arg);
		    	  m = model.getClass().getMethod(methodName, Long.class);
					Object ret = m.invoke(model, argI);
					continue;
		      }
			try {
				m = model.getClass().getMethod(methodName, String.class);
				Object ret = m.invoke(model, arg);
			} catch (NoSuchMethodException e) {
				try{
					Double argD = Double.valueOf(arg);
					m = model.getClass().getMethod(methodName, Double.class);
					Object ret = m.invoke(model, argD);
				}catch(NumberFormatException e2){

				    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						try{
						    Date parsedDate = (Date) dateFormat.parse(arg);
						    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
						    m = model.getClass().getMethod(methodName, Timestamp.class);
							Object ret = m.invoke(model, timestamp);
						}catch(Exception ex){
							ex.printStackTrace();
						}
						
				    
				}
				}

			
		        
		}
		return model; 
	}
	
	
	public XiangMuTaiZhang setXiangMuTaiZhangModel(XiangMuTaiZhang xmtz, Map<String, String[]> params) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
for (Entry<String, String[]> entry : params.entrySet()) {
			
			String methodName = "set" + Character.toUpperCase(entry.getKey().charAt(0)) + entry.getKey().substring(1);
			String arg = entry.getValue()[0];

		      Method m;
		      if(entry.getKey().equals("id")){
		    	  continue;
		      }
		      if(entry.getKey().equals("company_id")){
		    	  Integer argI = Integer.valueOf(arg);
		    	  m = xmtz.getClass().getMethod(methodName, String.class);
					Object ret = m.invoke(xmtz, argI);
		      }
			try {
				m = xmtz.getClass().getMethod(methodName, String.class);
				Object ret = m.invoke(xmtz, arg);
			} catch (NoSuchMethodException e) {
				try{
					Double argD = Double.valueOf(arg);
					m = xmtz.getClass().getMethod(methodName, Double.class);
					Object ret = m.invoke(xmtz, argD);
				}catch(NumberFormatException e2){

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
