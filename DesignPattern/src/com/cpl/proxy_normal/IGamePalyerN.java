package com.cpl.proxy_normal;
/**
 * ����Ļ�����ͨ��������Ҫ��һ��Ҫͨ��������ʷ����У���������ʳɹ�
 * @author king
 *
 */
public interface IGamePalyerN {//IGamePlayerForce
	public void login(String user,String password);
	/**���*/
	public void killMoster();
	
	/**����*/
	public void levelUp();
	
	/**ǿ�Ʊ����д���*/
	public IGamePalyerN getProxy();
}
