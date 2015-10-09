package com.cpl.proxy_dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;//被代理的人
	public MyInvocationHandler(Object obj) {
		super();
		this.target = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.target, args);//执行代理方法
	}

}
