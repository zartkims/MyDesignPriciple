package com.cpl.srp;
/**
 * 这个接口的职责就是做一些user相关的逻辑操作 
 * @author king
 *
 */
public interface IUserLogic {
	public void changePassword(String password);
	public boolean validatePassword(String password);
}
