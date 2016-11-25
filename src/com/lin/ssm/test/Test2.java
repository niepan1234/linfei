package com.lin.ssm.test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
		
		/*for(int i=1;i<10;i++){
			File file=new File("C:/Users/niepan/Desktop/web/菜鸟要飞第"+i+".txt");
			try {
				if(file.createNewFile())
					System.out.println("创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		for(int i=1;i<10;i++){
			File file=new File("C:/Users/niepan/Desktop/web/菜鸟要飞第"+i+".txt");
			File newFile=new File("C:/Users/niepan/Desktop/web/"+i+".txt");
			file.renameTo(newFile);
		}
		/*String[] strs=file.list();
		for (String string : strs) {
			System.out.println(string);
		}
		*/
		/*String[] str=file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				System.out.println(dir);
				File newFile=new File(dir,name);
				return newFile.isFile()&&name.endsWith("jpg");
			}
		});
		for (String string : str) {
			System.out.println(string);
		}*/
	}
	
}
