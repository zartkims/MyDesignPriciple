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
		//Ӧ���������ڵ�����ȥ��֮ǰ������ ����������ģ��
		return getBirthDay().toString();
	}

}
