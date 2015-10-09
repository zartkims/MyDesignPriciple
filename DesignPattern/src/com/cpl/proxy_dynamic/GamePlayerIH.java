package com.cpl.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * InvocationHandler��jdk�Դ��Ķ�̬����ӿ�
 * @author king
 *
 */
public class GamePlayerIH implements InvocationHandler {
	Class cls = null;//��������
	Object obj = null;//�������ʵ��
	
	public GamePlayerIH(Object obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equalsIgnoreCase("login"))System.out.println("���˵�½��");
//		System.out.println(method.getName());	
			
		return method.invoke(this.obj, args);
	}

}
