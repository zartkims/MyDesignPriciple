package com.cpl.proxy_normal;

public class NormalProxyMain {
	public static void main(String[] args) {
		GamePlayerN player = new GamePlayerN(null, "����");//�˴�û����ֱ�ӷ���
		System.out.println("=========������û��ͨ������=============");
		player.login("zhangs", "12345");
		player.killMoster();
		player.levelUp();
		System.out.println("==============");
		
		System.out.println("=======��������û��ͨ��ָ������=======");
		GameProxyN proxy = new GameProxyN("����");
		proxy.login("zhangs", "12345");
		proxy.killMoster();
		proxy.levelUp();
		System.out.println("===============");
	}
}
