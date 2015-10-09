package com.cpl.proxy_easy;

public class GamePalyer implements IGamePlayer{
	private String name;
	@Override
	public void login(String user, String password) {
		System.out.println("账号为"+user+" 的 "+this.name+"登陆了");
		
	}
	@Override
	public void killMoster() {
		System.out.println(this.name+"在打怪啊");
	}
	@Override
	public void levelUp() {
		System.out.println(this.name+"升级了");
	}
	public GamePalyer(String name) {
		super();
		this.name = name;
	}
	
}
