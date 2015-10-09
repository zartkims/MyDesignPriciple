package com.cpl.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyMain {
	public static void main(String[] args) {
		IGamePlayerD player = new GamePlayerD("张三");
		//
		InvocationHandler handler = new GamePlayerIH(player);
		ClassLoader cl = player.getClass().getClassLoader();
		
		//强行动态产生一个的代理
		IGamePlayerD proxy = (IGamePlayerD) Proxy.newProxyInstance(cl, /*IGamePlayerD.class*/player.getClass().getInterfaces(), handler);//从源码看出不止可以代理一个接口，可以很多个
		//窝日啊
		proxy.login("zhangs", "12345");
		proxy.killMoster();
		proxy.levelUp();
		
		
		
		
	}
}
