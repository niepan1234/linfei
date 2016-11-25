package com.lin.ssm.test.DataStructure;

public class test {
	public static void main(String[] args) {
		long before=System.currentTimeMillis();
		Func f=new FuncImpl();
		f.function();
		long after=System.currentTimeMillis();
		System.out.print("¹²ºÄÊ±£º"+(after-before));
	}
}
