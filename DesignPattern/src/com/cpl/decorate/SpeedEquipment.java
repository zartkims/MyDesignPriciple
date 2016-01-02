package com.cpl.decorate;

public class SpeedEquipment extends AirEquipment {

	public SpeedEquipment(IAirplane mAirplane) {
		super(mAirplane);
	}

	@Override
	protected void preFire() {
		System.out.println("�ٶȵ���Ϊ�ȶ�������");
	}

	@Override
	protected void preSpeedUp() {
		System.out.println("�˶����ƽ���׼����� ���������� ");
	}

}
