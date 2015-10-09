package com.cpl.proxy_normal;

public class GamePlayerN implements IGamePalyerN{
	private IGamePalyerN proxy = null;
	private String name;
	
	public GamePlayerN(IGamePalyerN proxy, String name) {
		super();
		if(proxy!=null&&proxy.getClass() == GameProxyN.class)//必须是代理来
			this.proxy = proxy;
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		if(isThroughProxy())System.out.println("账号为"+user+" 的 "+this.name+"登陆了");
		
	}

	@Override
	public void killMoster() {
		if(isThroughProxy())System.out.println(this.name+"在打怪啊");
		
	}

	@Override
	public void levelUp() {
		if(isThroughProxy())System.out.println(this.name+"升级了");
	}

	@Override
	public IGamePalyerN getProxy() {
		return proxy;
	}
	
	public boolean isThroughProxy(){
		if(proxy != null)return true;
		System.out.println("请通过指定代理来访问我");
		return false;
	}
}
