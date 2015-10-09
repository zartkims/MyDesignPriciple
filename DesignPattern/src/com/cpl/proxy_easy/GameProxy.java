package com.cpl.proxy_easy;

public class GameProxy implements IGamePlayer{
	private GamePalyer gamePalyer;
	public GameProxy(String name){
		gamePalyer = new GamePalyer(name);
	}
	@Override
	public void login(String user, String password) {
		//这里可以做一些前置操作
		gamePalyer.login(user, password);
	}

	@Override
	public void killMoster() {
		//这里可以做一些前置操作 这就代理的好处 也是动态代理的雏形
		useSkill();
		gamePalyer.killMoster();	
		//还可以有善后的工作
		//huicheng();
	}

	@Override
	public void levelUp() {
		gamePalyer.levelUp();
	}
	private void useSkill(){System.out.println("使用某技能等");}
	
}
