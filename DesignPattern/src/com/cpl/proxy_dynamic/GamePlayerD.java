package com.cpl.proxy_dynamic;

public class GamePlayerD implements IGamePlayerD{
	private String name;
	@Override
	public void login(String user, String password) {
		System.out.println("�˺�Ϊ"+user+" �� "+this.name+"��½��");
		
	}
	@Override
	public void killMoster() {
		System.out.println(this.name+"�ڴ�ְ�");
	}
	@Override
	public void levelUp() {
		System.out.println(this.name+"������");
	}
	public GamePlayerD(String name) {
		this.name = name;
	}

}
