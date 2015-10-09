package com.cpl.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * InvocationHandler是jdk自带的动态代理接口
 * @author king
 *
 */
public class GamePlayerIH implements InvocationHandler {
	Class cls = null;//被代理者
	Object obj = null;//被代理的实例
	
	public GamePlayerIH(Object obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equalsIgnoreCase("login"))System.out.println("有人登陆鸟");
//		System.out.println(method.getName());	
			
		return method.invoke(this.obj, args);
	}

}
