package com.lin.ssm.test.network.Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException, IOException {
		ServerSocket ss=new ServerSocket(10086);
		Socket s=ss.accept();
		String ip=s.getInetAddress().getHostAddress();
		InputStream is=s.getInputStream();
		byte[] b=new byte[1024];
		int len=is.read(b);
		String msg=new String(b,0,len);
		System.out.println(msg);
		
		OutputStream os=s.getOutputStream();
		os.write("数据收到".getBytes());
		
		s.close();
		
	}
}
