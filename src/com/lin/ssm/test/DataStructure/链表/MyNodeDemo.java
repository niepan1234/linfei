package com.lin.ssm.test.DataStructure.Á´±í;

public class MyNodeDemo {
	public static void main(String[] args) {
		ChainNode cn=new ChainNode();
		cn.addNode(new MyNode(2));
		cn.addNode(new MyNode(3));
		cn.addNode(new MyNode(4));
		cn.addNode(new MyNode(5));
		cn.printALl();
		cn.insert(new MyNode(6), 2);
		cn.printALl();
		System.out.println(cn.getSize());
		cn.deleteNode(0);
		cn.printALl();
		cn.deleteNode(3);
		cn.printALl();
		cn.deleteNode(1);
		cn.printALl();
	}
}	
