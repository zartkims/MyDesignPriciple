package com.cpl.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyMain {
	public static void main(String[] args) {
		IGamePlayerD player = new GamePlayerD("����");
		//
		InvocationHandler handler = new GamePlayerIH(player);
		ClassLoader cl = player.getClass().getClassLoader();
		
		//ǿ�ж�̬����һ���Ĵ���
		IGamePlayerD proxy = (IGamePlayerD) Proxy.newProxyInstance(cl, /*IGamePlayerD.class*/player.getClass().getInterfaces(), handler);//��Դ�뿴����ֹ���Դ���һ���ӿڣ����Ժܶ��
		//���հ�
		proxy.login("zhangs", "12345");
		proxy.killMoster();
		proxy.levelUp();
		
		
		
		
	}
}
