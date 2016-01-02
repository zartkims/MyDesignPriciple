package com.cpl.decorate;

public class FireEquipment extends AirEquipment {

	public FireEquipment(IAirplane mAirplane) {
		super(mAirplane);
	}

	@Override
	protected void preFire() {
		System.out.println("离子加农炮 填充完成 自动瞄准准备完毕");
	}

	@Override
	protected void preSpeedUp() {
		System.out.println("空气推进炮准备完毕,全武器收起");
	}

}
