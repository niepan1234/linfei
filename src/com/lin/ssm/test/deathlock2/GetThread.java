package com.lin.ssm.test.deathlock2;

public class GetThread implements Runnable {
	private Student s;
	public GetThread (Student s){
		this.s=s;
	}
	@Override
	public void run() {
		while(true)
			s.get();
	}
	
	
	
}