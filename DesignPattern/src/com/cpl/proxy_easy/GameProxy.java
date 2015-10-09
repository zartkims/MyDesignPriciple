package com.cpl.proxy_easy;

public class GameProxy implements IGamePlayer{
	private GamePalyer gamePalyer;
	public GameProxy(String name){
		gamePalyer = new GamePalyer(name);
	}
	@Override
	public void login(String user, String password) {
		//���������һЩǰ�ò���
		gamePalyer.login(user, password);
	}

	@Override
	public void killMoster() {
		//���������һЩǰ�ò��� ��ʹ���ĺô� Ҳ�Ƕ�̬����ĳ���
		useSkill();
		gamePalyer.killMoster();	
		//���������ƺ�Ĺ���
		//huicheng();
	}

	@Override
	public void levelUp() {
		gamePalyer.levelUp();
	}
	private void useSkill(){System.out.println("ʹ��ĳ���ܵ�");}
	
}
