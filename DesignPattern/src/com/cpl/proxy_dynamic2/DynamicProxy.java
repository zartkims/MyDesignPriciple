package com.cpl.proxy_dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * �������ģ���������̵�һ��ǰ��֪ͨ
 * @author king
 *
 * @param <T>
 */
public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader loader,
            Class<?>[] interfaces,
            InvocationHandler h){
		//����һ��ǰ��֪ͨ ÿ��������Ķ���ִ�м���˵ �������������
		new BeforeAdvice().exec();
		return (T) Proxy.newProxyInstance(loader, interfaces, h);//ʹ��h����һ���������
	}
}
