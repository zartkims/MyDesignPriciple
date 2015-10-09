package com.cpl.proxy_normal;


public class GameProxyN implements IGamePalyerN{
	private GamePlayerN gamePlayer;
	
	public GameProxyN(String name) {
		gamePlayer = new GamePlayerN(this,name);
	}

	@Override
	public void login(String user, String password) {
		gamePlayer.login(user, password);
		
	}

	@Override
	public void killMoster() {
		gamePlayer.killMoster();		
	}

	@Override
	public void levelUp() {
		gamePlayer.killMoster();		
	}

	@Override
	public IGamePalyerN getProxy() {
		return this;
	}

}
