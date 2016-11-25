package com.lin.ssm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MoNiReadLineDemo {
	public static void main(String[] args) throws IOException {
		MyWriter r=new MyWriter(new InputStreamReader(new FileInputStream(new File("C:\\Users\\niepan\\Desktop\\web\\1\\1.txt"))));
		String str="";
		while((str=r.readLine())!=null){
			System.out.println(str);
		}
		r.close();
	}
}
