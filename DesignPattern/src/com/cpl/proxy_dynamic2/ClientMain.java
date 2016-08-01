package com.cpl.proxy_dynamic2;

import java.lang.reflect.InvocationHandler;
/**
 * ����Ǹ�ͨ�õĶ�̬������
 * @author king
 *
 */
public class ClientMain {
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		InvocationHandler handler = new MyInvocationHandler(subject);//subject��������
		Subject proxy = DynamicProxy.newProxyInstance(
											subject.getClass().getClassLoader()
											, subject.getClass().getInterfaces(), handler);
		proxy.doSomething("�������");
		System.out.println();//����ֻ����΢�Ѷ����ŵ�һ����һ���С��������ھۺ�����һ��
		Subject proxy2 = SubjectDynamicProxy.newProxyInstance(subject);
		proxy2.doSomething("ok");
	}
}
