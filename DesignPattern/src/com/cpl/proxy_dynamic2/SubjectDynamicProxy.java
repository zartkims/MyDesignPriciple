package com.cpl.proxy_dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * ������п��� ��Ҫ�ǰ�main�еķ��������в��ֳ鵽�������
 * @author king
 *
 */
public class SubjectDynamicProxy extends DynamicProxy<Subject>{
	public static <T> T newProxyInstance(Subject subject){
		return newProxyInstance(subject.getClass().getClassLoader()
				, subject.getClass().getInterfaces()
				, new MyInvocationHandler(subject));//ʹ��h����һ���������
	}
}
