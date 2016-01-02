package com.cpl.adapter.class_adapter;
/**
 * 具体的目标实现者
 * @author king
 *
 */
public class ConcreteUserInfo implements IUserInfo{

	@Override
	public String getName() {
		return "concrete name";
	}

	@Override
	public String getSex() {
		return null;
	}

	@Override
	public String getAge() {
		return "30";
	}

}
