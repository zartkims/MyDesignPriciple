package com.cpl.srp;
/**
 * ����ӿڵ�ְ�������һЩuser��ص��߼����� 
 * @author king
 *
 */
public interface IUserLogic {
	public void changePassword(String password);
	public boolean validatePassword(String password);
}
