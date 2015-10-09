package com.cpl.proxy_force;

public class GamePlayerF implements IGamePlayerF{
	private IGamePlayerF proxy = null;
	private String name;
	
	public GamePlayerF(String name) {
		super();
		this.name = name;
//		this.proxy = new GameProxyF(this);
	}

	@Override
	public void login(String user, String password) {
		if(isThroughProxy())System.out.println("�˺�Ϊ"+user+" �� "+this.name+"��½��");
		
	}

	@Override
	public void killMoster() {
		if(isThroughProxy())System.out.println(this.name+"�ڴ�ְ�");
		
	}

	@Override
	public void levelUp() {
		if(isThroughProxy())System.out.println(this.name+"������");
	}

	@Override
	public IGamePlayerF getProxy() {
		if(this.proxy == null)this.proxy = new GameProxyF(this);//û�д������һ��
		return proxy;
	}
	
	public boolean isThroughProxy(){
		if(this.proxy != null)return true;
		System.out.println("��ͨ��ָ��������������");
		return false;
	}
}
