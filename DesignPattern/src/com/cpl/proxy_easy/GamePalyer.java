package com.cpl.proxy_easy;

public class GamePalyer implements IGamePlayer{
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
	public GamePalyer(String name) {
		super();
		this.name = name;
	}
	
}
