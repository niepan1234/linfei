package com.lin.ssm.test.DesignModel.single;

public class StudentDemo {
	public static void main(String[] args) {
		/*Student s=Student.getStudent();
		s.setAge(17);
		s.setName("����");
		System.out.println(s);
		
		Student s1=Student.getStudent();
		s.setName("����");
		System.out.println(s1);*/
		Teacher t=Teacher.getTeacher();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					Teacher t=Teacher.getTeacher();
					System.out.println(Thread.currentThread().getName()+t+"��"+i);
				}
				
			}
		}).start();
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					Teacher t=Teacher.getTeacher();
					System.out.println(Thread.currentThread().getName()+t+"��"+i);
				}
				
			}
		}).start();
	}
}
