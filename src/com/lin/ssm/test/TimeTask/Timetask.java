package com.lin.ssm.test.TimeTask;

public class Timetask {
	public static void main(String[] args) {
		final int m=100;
		final int n=1000;
		new Thread(new Runnable(){
			@Override
			public void run() {
				int sum=0;
				for (int i = 1; i <=m; i++) {
					sum+=i;
				}
				System.out.println("sum"+sum);
			}
			
		}).start();;
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				int sum=0;
				for (int i = 1; i <=n; i++) {
					sum+=i;
				}
				System.out.println("sum"+sum);
			}
			
		}).start();;
		
		new Thread(){
			public void run(){
				int sum=0;
				for (int i = 1; i <=n; i++) {
					sum+=i;
				}
				System.out.println("sum"+sum);
			}
		}.start();
	}
}
