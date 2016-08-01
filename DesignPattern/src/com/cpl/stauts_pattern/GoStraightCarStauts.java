package com.cpl.stauts_pattern;

public class GoStraightCarStauts extends ICarStatus {

	@Override
	public void turnOnCar() {
		//the car had been turn on 
	}

	@Override
	public void turnOffCar() {
		mContext.setCurrentStatus(CarContext.turnOffStatus);
		mContext.turnOffCar();
	}

	@Override
	public void goStraight() {
		System.out.println("ÎÑÔÚÍùÇ°¿ª");
	}

	@Override
	public void turnRightOrLeft() {
		mContext.setCurrentStatus(CarContext.turnRightOrLeftStatus);
		mContext.turnRightOrLeft();
	}

}
