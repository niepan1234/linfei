package com.lin.ssm.test.deathlock;

public class SetThread implements Runnable{

	private Student s;
	private int count=0;
	public SetThread(Student s){
		this.s=s;
	}
	@Override
	public void run() {
		while(true){
			synchronized (s) {
				if(s.isFlag()){
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if((count&1)==0){
					s.setAge(17);
					s.setName("张三");
				}else{
					s.setAge(18);
					s.setName("李四");
				}
				count++;
				s.setFlag(true);
				s.notify();
			}
		}
		
	}

}
