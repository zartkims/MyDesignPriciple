package com.cpl.stauts_pattern;

public class CarContext {
	public static TurnOnCarStauts turnOnStatus = new TurnOnCarStauts();
	public static TurnOffCarStauts turnOffStatus = new TurnOffCarStauts();
	public static TurnRightOrLeftCarStauts turnRightOrLeftStatus = new TurnRightOrLeftCarStauts();
	public static GoStraightCarStauts goStraightStatus = new GoStraightCarStauts();
	
	private ICarStatus mStatus;
	
	public void setCurrentStatus(ICarStatus status) {
		this.mStatus = status;
		status.setContext(this);
	}
	
	public void turnOnCar() {
		this.mStatus.turnOnCar();
	}

	public void turnOffCar() {
		this.mStatus.turnOffCar();
	}

	public void goStraight() {
		this.mStatus.goStraight();
	}

	public void turnRightOrLeft() {
		this.mStatus.turnRightOrLeft();
	}
}
