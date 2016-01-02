package com.cpl.adapter.obj_adapter;
/**
 * ������Ƕ���������
 * �������������Ĳ�֮ͬ�����������õ�����϶��Ǽ̳�
 * @author king
 *
 */
public class OutsideUserAdapter implements IUserInfo {
	private IOutsideUserBase userBase;
	private IOutsideUserHome userHome;
	
	@Override
	public String getPhone() {
		return userBase.getPhone();
	}

	@Override
	public String getName() {
		return userBase.getName();
	}

	@Override
	public int getAge() {
		return userBase.getAge();
	}

	@Override
	public int sex() {
		return userBase.getSex().equals("man") ? 0 : 1;
	}

	@Override
	public boolean isMerry() {
		return userHome.isMerry();
	}

	@Override
	public String homeLocation() {
		return userHome.getHomeAddress();
	}

	public OutsideUserAdapter(IOutsideUserBase userBase, IOutsideUserHome userHome) {
		super();
		this.userBase = userBase;
		this.userHome = userHome;
	}

	
}
