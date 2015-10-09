package com.cpl.proxy_dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * 这个就是模仿了切面编程的一个前置通知
 * @author king
 *
 * @param <T>
 */
public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader loader,
            Class<?>[] interfaces,
            InvocationHandler h){
		//插入一个前置通知 每个被代理的都会执行简单来说 这就是切面编程了
		new BeforeAdvice().exec();
		return (T) Proxy.newProxyInstance(loader, interfaces, h);//使用h构造一个代理对象
	}
}
