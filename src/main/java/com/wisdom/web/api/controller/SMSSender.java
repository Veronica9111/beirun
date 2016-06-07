package com.wisdom.web.api.controller;

import java.util.HashMap;
import java.util.Set;

import com.cloopen.rest.sdk.CCPRestSmsSDK;

public class SMSSender {

	private static CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
	
	private static HashMap<String, Object> result = null;
	
	static {
		
		restAPI.init("sandboxapp.cloopen.com", "8883");
		
		restAPI.setAccount("aaf98f8950121989015016e236f10353", "a004b220277e4c7fafe751ff17ee57cf");

		restAPI.setAppId("8a48b55150121695015016e5c6b90b60");
	}
	
	public static void sendTemplateSMS(String telephone) {
		
		result = restAPI.sendTemplateSMS(telephone,"1" ,new String[]{"6532","6"});
		
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

		restAPI.init("sandboxapp.cloopen.com", "8883");
		
		restAPI.setAccount("aaf98f8950121989015016e236f10353", "a004b220277e4c7fafe751ff17ee57cf");

		restAPI.setAppId("8a48b55150121695015016e5c6b90b60");
		
		
		result = restAPI.sendTemplateSMS("18601615517","1" ,new String[]{"6532","6"});
		
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
