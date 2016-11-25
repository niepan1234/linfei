package com.lin.ssm.test.deathlock2;

public class Student {
	private String name;
	private int age;
	private boolean flag;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public synchronized void set(String name,int age){
		if(flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.name=name;
		this.age=age;
		flag=true;
		this.notify();
	}
	
	public synchronized void get(){
		if(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(this.getName()+"---"+this.getAge());
		flag=false;
		this.notify();
	}
	
	
}
