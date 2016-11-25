package com.lin.ssm.test.DesignModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target; //��˭������
	
	public MyInvocationHandler(Object ob){
		this.target=ob;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Ȩ����֤");
		Object object=method.invoke(target, args);
		System.out.println("��־��¼");
		return object;
	}

}
