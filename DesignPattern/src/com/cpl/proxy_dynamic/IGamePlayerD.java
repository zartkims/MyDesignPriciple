package com.cpl.proxy_dynamic;
/**
 * 这个的话是普通代理，就是要求一定要通过代理访问否则不行，不让你访问成功
 * @author king
 *
 */
public interface IGamePlayerD {//IGamePlayerForce
	public void login(String user,String password);
	/**打怪*/
	public void killMoster();
	
	/**升级*/
	public void levelUp();
	
}
