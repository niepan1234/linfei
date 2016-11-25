package com.lin.ssm.test;

public class TreadDemo {
	public static void main(String[] args) {
		testMythread();
	}
	public static void testMythread(){
		MyrunnableDemo myr=new MyrunnableDemo();
		Thread t0=new Thread(myr);
		Thread t1=new Thread(myr);
		Thread t2=new Thread(myr);
		/*MyThread my1=new MyThread();
		MyThread my2=new MyThread();
		MyThread my3=new MyThread();*/
		/*Thread.currentThread().setName("林飞");
		t0.setDaemon(true);
		t1.setDaemon(true);
		t2.setDaemon(true);*/
		/*try {
			t0.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t0.setDaemon(true);
		t1.setDaemon(true);
		t2.setDaemon(true);
		t0.start();
		t1.start();
		t2.start();
		/*my1.start();
		my2.start();
		my3.start();*/
		for (int i = 0; i < 100; i++) {
			System.out.println("主线程"+i+"次运行");
		}
		System.out.println();
	}
}
