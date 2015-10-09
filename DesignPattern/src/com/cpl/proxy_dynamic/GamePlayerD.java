package com.cpl.proxy_dynamic;

public class GamePlayerD implements IGamePlayerD{
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
	public GamePlayerD(String name) {
		this.name = name;
	}

}
