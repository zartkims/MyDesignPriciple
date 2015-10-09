package com.cpl.proxy_easy;
/**
 * 这个做的是普通代理
 * 耦合也蛮小的
 * @author king
 *
 */
public interface IGamePlayer {
	public void login(String user,String password);
	/**打怪*/
	public void killMoster();
	
	/**升级*/
	public void levelUp();
	
}
