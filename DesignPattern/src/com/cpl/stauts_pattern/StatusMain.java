package com.cpl.stauts_pattern;

public class StatusMain {
	public static void main(String[] args) {
		CarContext car = new CarContext();
		car.setCurrentStatus(CarContext.turnOnStatus);
		car.turnOnCar();
//		car.turnOffCar();//����������Ͱѳ���״̬���ˣ��Ͳ���ת��ʲô����Ŷ
		car.turnRightOrLeft();
		car.turnOffCar();//�������û�ã�����Ϊ֮ǰ����ת�䲻��ͣ�� ���Ժ�����
		car.goStraight();
		car.turnOffCar();
	}
}
