package com.lin.ssm.test.network.Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException, Exception {
		Socket s=new Socket("127.0.0.1", 10086);
		OutputStream os=s.getOutputStream();
		os.write("Äã»¹ºÃÂð".getBytes());
		
		InputStream is=s.getInputStream();
		byte[] b=new byte[1024];
		int len=is.read(b);
		String msg=new String(b,0,len);
		System.out.println(msg);
		
		s.close();
	}
}
