package com.wisdom.web.api.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
		Integer id = Integer.valueOf(request.getParameter("id"));
		XiangMuTaiZhang xmtz = projectService.getXiangMuTaiZhangById(id);
		ObjectMapper m = new ObjectMapper();
		Map<String,Object> props = m.convertValue(xmtz, Map.class);
		XiangMuTaiZhang anotherBean = (XiangMuTaiZhang) m.convertValue(props, XiangMuTaiZhang.class);
		return props;
		
	}
	
	@RequestMapping("/project/modifyProject")
	@ResponseBody
	public Map<String, String> updateProjectById(HttpServletRequest request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		XiangMuTaiZhang xmtz = projectService.getXiangMuTaiZhangById(id);
		Map<String, String[]> params = request.getParameterMap();
		xmtz = setXiangMuTaiZhangModel(xmtz, params);
		projectService.updateProject(xmtz);
		Map<String, String> retMap = new HashMap<>();
		retMap.put("status", "ok");

		return retMap;
		
	}
	
	public XiangMuTaiZhang setXiangMuTaiZhangModel(XiangMuTaiZhang xmtz, Map<String, String[]> params) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
for (Entry<String, String[]> entry : params.entrySet()) {
			
			String methodName = "set" + Character.toUpperCase(entry.getKey().charAt(0)) + entry.getKey().substring(1);
			String arg = entry.getValue()[0];

		      Method m;
		      if(entry.getKey().equals("id")){
		    	  continue;
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
