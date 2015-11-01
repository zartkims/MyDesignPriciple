package com.cpl.mediator_pattern;

public class MediatorMain {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();//虽然有点不DIP 但也行,因为不同
		Buyer buyer = new Buyer(mediator);
		Sales sales = new Sales(mediator);
		Stock stock = new Stock(mediator);
		for (int i= 0; i < 10 ; i++) {
			sales.saleProduct((int)(Math.random()*200));
			System.out.println("==============");
			System.out.println();
		}
	}
}
