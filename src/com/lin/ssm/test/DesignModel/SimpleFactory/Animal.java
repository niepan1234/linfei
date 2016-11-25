package com.lin.ssm.test.DesignModel.SimpleFactory;

public abstract class Animal {
	
	
	public abstract void eat();
	
	/*private Animal(){
		
	}*/
	public static Animal AnimalFactory(String name){
		if("dog".equalsIgnoreCase(name))
			return new Dog();
		else if("cat".equalsIgnoreCase(name))
			return new Cat();
		else
			return null;
	}
}
