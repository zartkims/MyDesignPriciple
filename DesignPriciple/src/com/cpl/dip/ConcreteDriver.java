package com.cpl.dip;

public class ConcreteDriver implements IDriver{
	ICar car;
	@Override
	public void drive(ICar icar) {
		icar.run();//ʹ�ýӿڵ���
	}
	@Override
	public void setCar(ICar car) {
		this.car=car;
		
	}

	
	public void drive() {
		car.run();		
	}

}
