package com.cpl.proxy_dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * 这个可有可无 主要是吧main中的方法可以有部分抽到这个里面
 * @author king
 *
 */
public class SubjectDynamicProxy extends DynamicProxy<Subject>{
	public static <T> T newProxyInstance(Subject subject){
		return newProxyInstance(subject.getClass().getClassLoader()
				, subject.getClass().getInterfaces()
				, new MyInvocationHandler(subject));//使用h构造一个代理对象
	}
}
