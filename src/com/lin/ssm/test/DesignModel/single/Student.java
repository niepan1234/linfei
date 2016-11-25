package com.lin.ssm.test.DesignModel.single;

public class Student {
	private String name;
	private int age;
	
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

	private Student(){
	}
	private static  Student s=new Student();
	
	public static Student getStudent(){
		return s;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
