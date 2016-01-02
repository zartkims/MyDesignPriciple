package com.cpl.decorate;

public class FireEquipment extends AirEquipment {

	public FireEquipment(IAirplane mAirplane) {
		super(mAirplane);
	}

	@Override
	protected void preFire() {
		System.out.println("���Ӽ�ũ�� ������ �Զ���׼׼�����");
	}

	@Override
	protected void preSpeedUp() {
		System.out.println("�����ƽ���׼�����,ȫ��������");
	}

}
