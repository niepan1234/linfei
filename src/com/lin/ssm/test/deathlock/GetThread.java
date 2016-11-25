package com.lin.ssm.test.deathlock;

public class GetThread implements Runnable {
	private Student s;
	public GetThread (Student s){
		this.s=s;
	}
	@Override
	public void run() {
		while(true)
		synchronized (s) {
			if(!s.isFlag()){
				try {
					s.wait();  //¡¢º¥ Õ∑≈À¯
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(s.getName()+"--"+s.getAge());
			s.setFlag(false);
			s.notify();
		}
	}
	
	
	
}
