package com.lin.ssm.test.TimeTask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Time {
	public static void main(String[] args) {
		Timer t=new Timer();
		t.schedule(new MyTask(t), new Date(),3000);
	}
}
class MyTask extends TimerTask{
	private Timer t;
	public MyTask(Timer t){
		this.t=t;
	}
	@Override
	public void run() {
		System.out.println("¶¨Ê±Õ¨µ¯¿ªÆô");
		t.cancel();
	}
	
}