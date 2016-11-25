package com.lin.ssm.test.DesignModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target; //对谁做代理
	
	public MyInvocationHandler(Object ob){
		this.target=ob;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("权限认证");
		Object object=method.invoke(target, args);
		System.out.println("日志记录");
		return object;
	}

}
