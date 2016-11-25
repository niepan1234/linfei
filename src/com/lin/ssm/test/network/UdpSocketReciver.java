package com.lin.ssm.test.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpSocketReciver {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(10086);
		byte[] b=new byte[1024];
		int length=b.length;
		DatagramPacket p=new DatagramPacket(b, length);
		while(true){
		ds.receive(p); //阻塞状态
		
		//解析数据包，在控制器显示
		InetAddress ia=p.getAddress();
		int len=p.getLength();
		String ip=ia.getHostAddress();
		byte[] by2=p.getData();
		System.out.println(ip+"发送的信息----"+new String(by2,0,len));
		//System.out.println("接收结束");
		}
		
		
		
	}
}
