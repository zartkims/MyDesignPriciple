package com.cpl.srp;

/**
 * 可以看出这个接口的职责很简单就是保存内的属性的
 * @author king
 *
 */
public interface IUserOB {
	public void setName(String name);
	public void setAge(int age);
	public void setPasssword(String password);
	public String getName();
	public int getAge();
	public String getPassword();
}
