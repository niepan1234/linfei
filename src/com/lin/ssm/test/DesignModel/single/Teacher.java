package com.lin.ssm.test.DesignModel.single;

public class Teacher {
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
	private Teacher(){
		
	}
	private static Teacher t=null;
	public  static Teacher getTeacher(){
		if(t==null){
			t= new Teacher();
			/*t.setAge(17);
			t.setName("ÕÅÈı");*/
		}
		return t;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	
}
