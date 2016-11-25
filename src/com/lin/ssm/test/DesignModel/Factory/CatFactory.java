package com.lin.ssm.test.DesignModel.Factory;

public class CatFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
