package com.lin.ssm.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream os=new FileOutputStream("C:/Users/niepan/Desktop/web/小鞠.avi");
		//os.write("测试".getBytes());
		/*for (int i = 0; i < 5; i++) {
			String str="第"+i+"条记录"+"\r\n";
			os.write(str.getBytes());
		}
		os.close();*/
		FileInputStream os2=new FileInputStream("C:/Users/niepan/Desktop/web/1.avi");
		int b;
		byte[] by=new byte[1024];
		int length=0;
		while((length=os2.read(by))!=-1){
			os.write(by,0,length);
		}
		os2.close();
		os.close();
	}
}
