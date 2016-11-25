package com.lin.ssm.test.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		/*ExecutorService es=Executors.newFixedThreadPool(5);
		es.execute(new Runable1());
		es.execute(new Runable2());
		es.shutdown();*/
		final int m=100;
		final int n=50;
		new Thread(){
			public void run(){
				for (int i = 0; i < m;i++) {
					System.out.println(Thread.currentThread().getName()+"---"+i);
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (int i = 0; i < n; i++) {
					System.out.println(Thread.currentThread().getName()+"---"+i);
				}
			}
		}.start();
	}
}
