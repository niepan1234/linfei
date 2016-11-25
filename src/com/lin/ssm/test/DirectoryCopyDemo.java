package com.lin.ssm.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DirectoryCopyDemo {
	public static void main(String[] args) throws IOException {
		String oldPath="C:\\Users\\niepan\\Desktop\\web\\1";
		String newPath="C:\\Users\\niepan\\Desktop\\web\\2";
		File oldFile=new File(oldPath);
		File newFile=new File(newPath);
		if(!newFile.exists()){
			newFile.mkdir();
		}
		File[] fileList=oldFile.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				String oldName=pathname.getName();
				return oldName.endsWith(".txt");
			}
		});
		for (File file : fileList) {
			String name=file.getName();
			File newfile=new File(newFile, name.replaceAll(".txt", ".mvk"));
			copyToFile(file,newfile);
		}
	}
	private static void copyToFile(File file,File newFile) throws IOException{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));
		int length=0;
		byte[] b=new byte[1024];
		while((length=bis.read(b))!=-1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
}
