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
		ds.receive(p); //����״̬
		
		//�������ݰ����ڿ�������ʾ
		InetAddress ia=p.getAddress();
		int len=p.getLength();
		String ip=ia.getHostAddress();
		byte[] by2=p.getData();
		System.out.println(ip+"���͵���Ϣ----"+new String(by2,0,len));
		//System.out.println("���ս���");
		}
		
		
		
	}
}
