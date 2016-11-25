package com.lin.ssm.test.DesignModel.SimpleFactory;

public class Test {
	public static void main(String[] args) {
		Animal a=Animal.AnimalFactory("Dog");
		a.eat();
		a=Animal.AnimalFactory("cat");
		a.eat();
	}
}
