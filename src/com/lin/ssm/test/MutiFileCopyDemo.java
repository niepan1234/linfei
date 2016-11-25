package com.lin.ssm.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MutiFileCopyDemo {
	public static void main(String[] args) throws IOException {
		File srcFile=new File("C:\\Users\\niepan\\Desktop\\web\\1");
		File tarFile=new File("C:\\Users\\niepan\\Desktop\\2");
		dirCopy(srcFile,tarFile);
		System.out.println("文件夹复制完毕");
	}
	public static void dirCopy(File srcfile,File tarfile)throws IOException{
		File[] files=srcfile.listFiles();
		for (File file : files) {
			if(file.isFile()){
				FileCopy(file,new File(tarfile,file.getName()));
			}else{
				File dir=new File(tarfile, file.getName());
				dir.mkdir();
				dirCopy(file,dir);
			}
		}
		
	}
	public static void FileCopy(File srcfile,File tarfiel) throws IOException {
		FileInputStream fi=new FileInputStream(srcfile);
		FileOutputStream fo=new FileOutputStream(tarfiel);
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
}
