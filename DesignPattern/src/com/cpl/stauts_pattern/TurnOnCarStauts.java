package com.cpl.stauts_pattern;

public class TurnOnCarStauts extends ICarStatus {

	@Override
	public void turnOnCar() {
		System.out.println("now is turn on the car");
	}

	@Override
	public void turnOffCar() {
		mContext.setCurrentStatus(CarContext.turnOffStatus);
		mContext.turnOffCar();
	}

	@Override
	public void goStraight() {
		mContext.setCurrentStatus(CarContext.goStraightStatus);
		mContext.goStraight();
	}

	@Override
	public void turnRightOrLeft() {
		mContext.setCurrentStatus(CarContext.turnRightOrLeftStatus);
		mContext.turnRightOrLeft();
	}

}
