package com.lin.ssm.test.network;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class NetWorkDemo {
	public static void main(String[] args) throws IOException {
			/*InetAddress a=InetAddress.getByName("10.8.204.132");
			String name=a.getHostName();
			String ip=a.getHostAddress();
			System.out.println(name+"--"+ip);*/
			//UDP协议
			DatagramSocket s = new DatagramSocket();  
			BufferedReader bw=new BufferedReader(new InputStreamReader(System.in));
			String str="";
			while((str=bw.readLine())!=null){
				if("886".equals(str))
					break;
				byte[] b=str.getBytes();
				int length=b.length;
				InetAddress address=InetAddress.getByName("127.0.0.255");
				int port=10086;
				DatagramPacket p=new DatagramPacket(b,length, address, port);
				try {
					s.send(p);
					//System.out.println("信息发送成功");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//byte[] b="hello".getBytes();
			s.close();
	}
}
