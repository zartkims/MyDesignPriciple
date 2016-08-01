package com.cpl.proxy_dynamic2;

import java.lang.reflect.InvocationHandler;
/**
 * 这个是个通用的动态代理框架
 * @author king
 *
 */
public class ClientMain {
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		InvocationHandler handler = new MyInvocationHandler(subject);//subject被代理了
		Subject proxy = DynamicProxy.newProxyInstance(
											subject.getClass().getClassLoader()
											, subject.getClass().getInterfaces(), handler);
		proxy.doSomething("这就完了");
		System.out.println();//下面只是稍微把东西放到一个类一面减小耦合增加内聚和上面一样
		Subject proxy2 = SubjectDynamicProxy.newProxyInstance(subject);
		proxy2.doSomething("ok");
	}
}
