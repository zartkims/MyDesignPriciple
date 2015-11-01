package com.cpl.mediator_pattern;

public class Sales extends AbstarctColleage{

	public Sales(ConcreteMediator mediator) {
		super(mediator);
		mediator.setmSales(this);
	}
	
	public void saleProduct(int num) {
		System.out.println("I sale " + num + " products");
		super.mMediator.saleProdcut(num);
	}
	
	public void toSale() {
		int toSale = (int) (Math.random()*300);
		System.out.println("I be called to sell " + toSale + " products");
		super.mMediator.saleProdcut(toSale);
	}
}
