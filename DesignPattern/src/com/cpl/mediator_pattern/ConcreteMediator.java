package com.cpl.mediator_pattern;

public class ConcreteMediator extends AbstractMediator {
	
	public void saleProdcut(int num) {
		int currentNum = super.mStock.getProductNum();
		if (num > currentNum) {
			System.out.println("is not engouht "+ num +"product to sale");
			super.mBuyer.buyProduct(num);
			return ; 
		}

		super.mStock.decreaseProduct(num);
		if (((float)num/currentNum)>0.7) { // more than 70% were saled , have to buy
			super.mBuyer.buyProduct((int)(num*1.5));
		}
	}
	
	public void buyProduct(int num) {
		if (num < super.mStock.getProductNum()/2) {
			System.out.println("is enough !!");
			return ;
		}
		super.mStock.increaseProduct(num);
	}
	
	public void callSale() {
		super.mSales.toSale();
	}
}
