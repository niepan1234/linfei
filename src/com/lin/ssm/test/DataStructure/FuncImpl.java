package com.lin.ssm.test.DataStructure;

public class FuncImpl implements Func {

	@Override
	public void function() {
		int n=1000;
		for (int i = 1; i<=1000; i++) {
			System.out.print(i+",");
		}
		System.out.println();
	}

	@Override
	public void function2(int n) {
		/*if(n<0) break;
		else function2(n-1);*/
		
	}

	
}
