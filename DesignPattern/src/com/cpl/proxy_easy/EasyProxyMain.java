package com.cpl.proxy_easy;

public class EasyProxyMain {
	public static void main(String[] args) {
		
		//我这里只要知道代理就行,并不需要知道具体的player (简单来说就是不用new player来封装)
		GameProxy proxy = new GameProxy("张三");
		proxy.login("playerzhang", "123455");
		proxy.killMoster();
		proxy.levelUp();
	}
}
