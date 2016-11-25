package com.lin.ssm.test.DesignModel.Factory;

public class SheepFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Sheep();
	}

}
