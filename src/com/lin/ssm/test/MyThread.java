package com.lin.ssm.test;

public class MyThread extends Thread {

	private static int num=100;
	@Override
	public void run() {
		BuyTiket();
		
	}
	private void BuyTiket() {
		synchronized (this) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(num>0){
				System.out.println(getName()+"正在购买第"+num--+"张票");
			}
			
		}
	}
	
}
