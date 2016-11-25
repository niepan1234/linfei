package com.lin.ssm.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock implements Runnable{
	private Lock lock=new ReentrantLock();
	private int ticketNum=100;
	@Override
	public void run() {
		while(true)
			saleTicket();
	}

	private void saleTicket() {
		try{
			lock.lock();
			if(ticketNum>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在卖第"+ticketNum--+"张票");
			}
		}finally{
			lock.unlock();
		}
		
	}
	
}
