package com.cpl.proxy_force;

public class ForceProxyMain {
	public static void main(String[] args) {
		GamePlayerF player = new GamePlayerF("����");//�˴�û����ֱ�ӷ���
//		player
		System.out.println("=========������û��ͨ������=============");
		player.login("zhangs", "12345");
		player.killMoster();
		player.levelUp();
		System.out.println("==============\n");
		
		
		System.out.println("=======��������û��ͨ��ָ������=======");
		GameProxyF proxy = new GameProxyF(player);//����Ҹ���������϶��ǲ��е�
		proxy.login("zhangs", "12345");
		proxy.killMoster();
		proxy.levelUp();
		System.out.println("===============\n");
		
		
		System.out.println("=======������ͨ��ָ���Ĵ���������========");
		IGamePlayerF mproxy = player.getProxy();//����Ҹ���������϶��ǲ��е�
		mproxy.login("zhangs", "12345");
		mproxy.killMoster();
		mproxy.levelUp();
		System.out.println("=======��������û��ͨ��ָ������=======");
		
		
	}
}
/**
 *���Ǹ��˾��������ӻ�����ȱ�ݣ�������getProxy��ʱ��ÿ�η��صĶ��Ǹ��µ�����Ȼ����ѧ�� 
 *���ҷ���һ��֮�����ͨ���Ǵ���������
 */
