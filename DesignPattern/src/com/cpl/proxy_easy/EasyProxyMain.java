package com.cpl.proxy_easy;

public class EasyProxyMain {
	public static void main(String[] args) {
		
		//������ֻҪ֪���������,������Ҫ֪�������player (����˵���ǲ���new player����װ)
		GameProxy proxy = new GameProxy("����");
		proxy.login("playerzhang", "123455");
		proxy.killMoster();
		proxy.levelUp();
	}
}
