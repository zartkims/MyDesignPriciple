package com.cpl.decorate;

public class SpeedEquipment extends AirEquipment {

	public SpeedEquipment(IAirplane mAirplane) {
		super(mAirplane);
	}

	@Override
	protected void preFire() {
		System.out.println("速度调整为稳定最佳完毕");
	}

	@Override
	protected void preSpeedUp() {
		System.out.println("核动力推进器准备完毕 机体变形完毕 ");
	}

}
