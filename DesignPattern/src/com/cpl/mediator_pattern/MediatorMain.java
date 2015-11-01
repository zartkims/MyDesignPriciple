package com.cpl.mediator_pattern;

public class MediatorMain {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();//��Ȼ�е㲻DIP ��Ҳ��,��Ϊ��ͬ
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
