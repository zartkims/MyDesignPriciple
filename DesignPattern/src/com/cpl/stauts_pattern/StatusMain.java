package com.cpl.stauts_pattern;

public class StatusMain {
	public static void main(String[] args) {
		CarContext car = new CarContext();
		car.setCurrentStatus(CarContext.turnOnStatus);
		car.turnOnCar();
//		car.turnOffCar();//如果加了这句就把车的状态关了，就不能转弯什么的了哦
		car.turnRightOrLeft();
		car.turnOffCar();//发现这句没用，是因为之前是在转弯不能停下 所以忽略了
		car.goStraight();
		car.turnOffCar();
	}
}
