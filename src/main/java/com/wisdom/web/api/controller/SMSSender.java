package com.wisdom.web.api.controller;

import java.util.HashMap;
import java.util.Set;

import com.cloopen.rest.sdk.CCPRestSmsSDK;

public class SMSSender {

	private static CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
	
	private static HashMap<String, Object> result = null;
	
	static {
		
		restAPI.init("app.cloopen.com", "8883");
		
		restAPI.setAccount("aaf98f8950121989015016e236f10353", "a004b220277e4c7fafe751ff17ee57cf");

		restAPI.setAppId("8a216da8555d110e015575e7fd4e2247");
	}
	
	public static void sendTemplateSMS(String telephone, String templateId, String[] infos) {
		
		result = restAPI.sendTemplateSMS(telephone, templateId, infos);
		
		System.out.println("SDKTestGetSubAccounts result=" + result);
		
		if("000000".equals(result.get("statusCode"))){
			//正常返回输出data包体信息（map）
			HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
			Set<String> keySet = data.keySet();
			for(String key:keySet){
				Object object = data.get(key);
				System.out.println(key +" = "+object);
			}
		}else{
			//异常返回输出错误码和错误信息
			System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
		}
	}
	
	public static void main(String[] args) {
		HashMap<String, Object> result = null;

		//初始化SDK
		CCPRestSmsSDK restAPI = new CCPRestSmsSDK();

		restAPI.init("app.cloopen.com", "8883");
		
		restAPI.setAccount("aaf98f8950121989015016e236f10353", "a004b220277e4c7fafe751ff17ee57cf");

		restAPI.setAppId("8a216da8555d110e015575e7fd4e2247");
		
		
		result = restAPI.sendTemplateSMS("18601615517", "94984", new String[]{"测试"});
		
		System.out.println("SDKTestGetSubAccounts result=" + result);
		if("000000".equals(result.get("statusCode"))){
			//正常返回输出data包体信息（map）
			HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
			Set<String> keySet = data.keySet();
			for(String key:keySet){
				Object object = data.get(key);
				System.out.println(key +" = "+object);
			}
		}else{
			//异常返回输出错误码和错误信息
			System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
		}
	}

}
