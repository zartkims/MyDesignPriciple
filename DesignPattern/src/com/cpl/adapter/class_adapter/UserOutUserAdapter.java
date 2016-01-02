package com.cpl.adapter.class_adapter;

public class UserOutUserAdapter extends OutSideUser implements IUserInfo{

	@Override
	public String getName() {
		return getMyName();
	}

	@Override
	public String getSex() {
		return getMySex() == 1 ? "man" : "female";
	}

	@Override
	public String getAge() {
		//应该是用现在的日期去减之前的日期 不过现在是模拟
		return getBirthDay().toString();
	}

}
