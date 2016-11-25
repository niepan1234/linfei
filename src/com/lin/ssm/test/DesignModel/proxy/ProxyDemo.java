package com.lin.ssm.test.DesignModel.proxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		Student s=new StudentImpl();
		/*s.register();
		s.login();*/
		MyInvocationHandler handler=new MyInvocationHandler(s);
		Student sProxy=(Student) Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), handler);
		sProxy.register();
		sProxy.login();
	}
}
