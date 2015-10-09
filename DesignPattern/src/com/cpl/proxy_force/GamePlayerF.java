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
	public IGamePlayerF getProxy() {
		if(this.proxy == null)this.proxy = new GameProxyF(this);//没有代理就找一个
		return proxy;
	}
	
	public boolean isThroughProxy(){
		if(this.proxy != null)return true;
		System.out.println("请通过指定代理来访问我");
		return false;
	}
}
