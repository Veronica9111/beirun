package com.wisdom.web.api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisdom.common.model.Permission;
import com.wisdom.permission.service.IPermissionService;
import com.wisdom.user.service.IUserService;
import com.wisdom.utils.SessionConstant;

import net.sf.json.JSONArray;

@Controller
public class ProjectController {

	@Autowired IPermissionService permissionService;
	
	@Autowired IUserService userService;
	
	private static final Logger logger = LoggerFactory
			.getLogger(ProjectController.class);
	
	@RequestMapping("/project/addProject")
	@ResponseBody
	public Map<String, String> addProject(HttpServletRequest request){
		Map<String, String> retMap = new HashMap<>();
		String description = request.getParameter("description");
		String createTime = request.getParameter("create_time");
		System.out.println("Description: " + description + " Time: " + createTime);
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
}
