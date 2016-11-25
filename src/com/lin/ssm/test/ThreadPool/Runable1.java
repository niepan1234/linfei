package com.lin.ssm.test.ThreadPool;

public class Runable1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
		
	}

}
