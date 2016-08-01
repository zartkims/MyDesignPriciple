package com.cpl.stauts_pattern;

public class TurnRightOrLeftCarStauts extends ICarStatus {

	@Override
	public void turnOnCar() {
		//had been turn on
	}

	@Override
	public void turnOffCar() {
		// when turn right or left can't stop
		System.out.println("ת�䲻��ͣ��");
	}

	@Override
	public void goStraight() {
		mContext.setCurrentStatus(CarContext.goStraightStatus);
		mContext.goStraight();
	}

	@Override
	public void turnRightOrLeft() {
		System.out.println("ת������������");
	}

}
