package com.cpl.proxy_normal;

public class NormalProxyMain {
	public static void main(String[] args) {
		GamePlayerN player = new GamePlayerN(null, "张三");//此处没代理直接访问
		System.out.println("=========下面是没有通过代理=============");
		player.login("zhangs", "12345");
		player.killMoster();
		player.levelUp();
		System.out.println("==============");
		
		System.out.println("=======下面这是没有通过指定代理！=======");
		GameProxyN proxy = new GameProxyN("张三");
		proxy.login("zhangs", "12345");
		proxy.killMoster();
		proxy.levelUp();
		System.out.println("===============");
	}
}
