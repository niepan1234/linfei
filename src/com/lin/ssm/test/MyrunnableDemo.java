package com.lin.ssm.test;

public class MyrunnableDemo implements Runnable{
	private static int num=100;
	@Override
	public void run() {
		while(true)
			BuyTiket();
	}
	private synchronized void BuyTiket() {
		if(num>0){
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+"���ڹ����"+num--+"��Ʊ,ʣ��"+num+"��Ʊ");
		}
	}
}
