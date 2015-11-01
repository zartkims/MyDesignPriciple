package com.cpl.mediator_pattern;

public class Buyer extends AbstarctColleage {

	public Buyer(ConcreteMediator mediator) {
		super(mediator);
		mediator.setmBuyer(this);
	}

	public void buyProduct(int num) {
		System.out.println("I buy " + num + " products");
		super.mMediator.buyProduct(num);
	}
}
