package com.lin.ssm.test.DesignModel.Factory;

public class Test {
	public static void main(String[] args) {
		AnimalFactory af=new DogFactory();
		Animal a=af.createAnimal();
		a.eat();
		
		af=new SheepFactory();
		a=af.createAnimal();
		a.eat();
	}
}
