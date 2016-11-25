package com.lin.ssm.test.deathlock2;

public class SetThread implements Runnable{

	private Student s;
	private int count=0;
	public SetThread(Student s){
		this.s=s;
	}
	@Override
	public void run() {
		while(true){
			if((count&1)==0)
					s.set("张三", 14);
			else
					s.set("李四", 15);
			count++;
			}
		}

}
