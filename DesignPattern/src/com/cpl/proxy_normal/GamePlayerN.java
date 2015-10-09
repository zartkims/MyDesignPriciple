package com.cpl.proxy_normal;

public class GamePlayerN implements IGamePalyerN{
	private IGamePalyerN proxy = null;
	private String name;
	
	public GamePlayerN(IGamePalyerN proxy, String name) {
		super();
		if(proxy!=null&&proxy.getClass() == GameProxyN.class)//�����Ǵ�����
			this.proxy = proxy;
		this.name = name;
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
	public IGamePalyerN getProxy() {
		return proxy;
	}
	
	public boolean isThroughProxy(){
		if(proxy != null)return true;
		System.out.println("��ͨ��ָ��������������");
		return false;
	}
}
