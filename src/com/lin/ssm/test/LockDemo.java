package com.lin.ssm.test;



public class LockDemo {
	public static void main(String[] args) {
		MyLock m=new MyLock();
		Thread t0=new Thread(m);
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);
		t0.start();
		t1.start();
		t2.start();
	}
}
