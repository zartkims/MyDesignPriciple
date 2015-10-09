package com.cpl.proxy_force;

public class ForceProxyMain {
	public static void main(String[] args) {
		GamePlayerF player = new GamePlayerF("张三");//此处没代理直接访问
//		player
		System.out.println("=========下面是没有通过代理=============");
		player.login("zhangs", "12345");
		player.killMoster();
		player.levelUp();
		System.out.println("==============\n");
		
		
		System.out.println("=======下面这是没有通过指定代理！=======");
		GameProxyF proxy = new GameProxyF(player);//随便找个人来代理肯定是不行的
		proxy.login("zhangs", "12345");
		proxy.killMoster();
		proxy.levelUp();
		System.out.println("===============\n");
		
		
		System.out.println("=======下面是通过指定的代理来访问========");
		IGamePlayerF mproxy = player.getProxy();//随便找个人来代理肯定是不行的
		mproxy.login("zhangs", "12345");
		mproxy.killMoster();
		mproxy.levelUp();
		System.out.println("=======下面这是没有通过指定代理！=======");
		
		
	}
}
/**
 *但是个人觉得这例子还是有缺陷，就是在getProxy的时候，每次返回的都是个新的这显然不科学啊 
 *而且返回一次之后就能通过非代理来访问
 */
