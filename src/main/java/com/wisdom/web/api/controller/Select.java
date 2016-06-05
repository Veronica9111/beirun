package com.wisdom.web.api.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Select {

	public static void main(String[] args) {
		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(new File("/home/invoice/process/text.txt")), "UTF-8");// ���ǵ������ʽ
			BufferedReader bufferedReader = new BufferedReader(read);
			StringBuilder sb = new StringBuilder();
			sb.append("select ");
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				sb.append(lineTxt+",");
			}
			sb.setCharAt(sb.length()-1, ' ');
			sb.append(" from jianyijishuifangfazhuanpiaojishui where id=#{id}");
			read.close();
			FileWriter writer = new FileWriter("/home/invoice/process/final.txt", true);
			writer.write(sb.toString());
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
