package com.cpl.proxy_force;


public class GameProxyF implements IGamePlayerF{
	private GamePlayerF gamePlayer;
	
	public GameProxyF(GamePlayerF player) {
		this.gamePlayer = player;
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
	public IGamePlayerF getProxy() {
		return this;
	}

}
