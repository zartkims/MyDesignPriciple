package com.cpl.stauts_pattern;

public abstract class ICarStatus {
	protected CarContext mContext;
	public void setContext(CarContext context) {
		this.mContext = context;
	}
	
	public abstract void turnOnCar();
	
	public abstract void turnOffCar();
	
	public abstract void goStraight();
	
	public abstract void turnRightOrLeft();
}
