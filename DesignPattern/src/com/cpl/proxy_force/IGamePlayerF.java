package com.cpl.proxy_force;
/**
 * ����Ļ�����ͨ��������Ҫ��һ��Ҫͨ��������ʷ����У���������ʳɹ�
 * @author king
 *
 */
public interface IGamePlayerF {//IGamePlayerForce
	public void login(String user,String password);
	/**���*/
	public void killMoster();
	
	/**����*/
	public void levelUp();
	
	/**ǿ�Ʊ����д���*/
	public IGamePlayerF getProxy();
}
