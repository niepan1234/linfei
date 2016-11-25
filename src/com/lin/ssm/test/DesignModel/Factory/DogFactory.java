package com.lin.ssm.test.DesignModel.Factory;

public class DogFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
