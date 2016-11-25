package com.lin.ssm.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		String oldPath="C:\\Users\\niepan\\Desktop\\web\\1.avi";
		String newPath="C:\\Users\\niepan\\Desktop\\web\\2.avi";
		long oldDate=System.currentTimeMillis();
		//method(oldPath,newPath);//共耗时267788毫秒
		//method2(oldPath,newPath);共耗时2038毫秒
		method3(oldPath,newPath);//共耗时3833毫秒
		//method4(oldPath,newPath);// 共耗时750毫秒  共耗时287毫秒  共耗时245毫秒
		long newDate=System.currentTimeMillis();
		System.out.println("共耗时"+(newDate-oldDate)+"毫秒");
	}

	public static void method4(String oldPath, String newPath) throws IOException {
		FileInputStream fi=new FileInputStream(oldPath);
		FileOutputStream fo=new FileOutputStream(newPath);
		BufferedInputStream bis=new BufferedInputStream(fi);
		BufferedOutputStream bos=new BufferedOutputStream(fo);
		byte[] b=new byte[2048];
		int length=0;
		while((length=bis.read(b))!=-1){
			bos.write(b,0,length);
		}
		fi.close();
		fo.close();
		
	}

	public static void method3(String oldPath, String newPath)throws IOException {
		FileInputStream fi=new FileInputStream(oldPath);
		FileOutputStream fo=new FileOutputStream(newPath);
		BufferedInputStream bis=new BufferedInputStream(fi);
		BufferedOutputStream bos=new BufferedOutputStream(fo);
		int b=0;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		fi.close();
		fo.close();
	}

	public static void method2(String oldPath, String newPath) throws IOException {
		FileInputStream fi=new FileInputStream(oldPath);
		FileOutputStream fo=new FileOutputStream(newPath);
		byte[] b=new byte[1024];
		int length=0;
		while((length=fi.read(b))!=-1){
			fo.write(b, 0, length);
		}
		fi.close();
		fo.close();
	}

	public static void method(String oldPath,String newPath) throws IOException {
		FileInputStream fi=new FileInputStream(oldPath);
		FileOutputStream fo=new FileOutputStream(newPath);
		int b=0;
		while((b=fi.read())!=-1){
			fo.write(b);
		}
		fi.close();
		fo.close();
	}
}
