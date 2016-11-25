package com.lin.ssm.test.Path;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PathDemo {
	public static void main(String[] args){
		InputStream is=PathDemo.class.getResourceAsStream("/com/lin/ssm/db.txt");
		Properties p=new Properties();
		try {
			p.load(is);
			is.close();
			String userName=(String) p.get("userName");
			String pwd=(String) p.get("pwd");
			System.out.println(userName+"-----"+pwd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
