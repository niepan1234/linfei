package com.lin.ssm.test.DesignModel.adapters;

public class AdapterDemo {
	public static void main(String[] args) {
		UserService us=new UserAdapter();
		us.insert();
	}
}
