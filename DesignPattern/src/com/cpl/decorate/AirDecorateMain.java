package com.cpl.decorate;
/**
 * �ж�����Ϊɶ��ô˧ <- cou biao lian
 * @author king
 *
 */
public class AirDecorateMain {
	public static void main(String[] args) {
		AirEquipment airplane 
			= new SpeedEquipment(new FireEquipment(new CorePlane()));
		airplane.speedUp();
		System.out.println();
		System.out.println();
		airplane.fire();
	}
}
