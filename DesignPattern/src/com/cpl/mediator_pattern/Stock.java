package com.cpl.mediator_pattern;

public class Stock extends AbstarctColleage {
	private int productNum = 100 ; //模拟货物的存量
	
	public Stock(ConcreteMediator mediator) {
		super(mediator);
		mediator.setmStock(this);
	}
	
	public void increaseProduct(int num) {
		productNum += num;
		System.out.println("stock increase "+num);
		if (productNum > 100) callSale();
	}
	
	public void decreaseProduct(int num) { 
		productNum -= num;
		System.out.println("stock decrease " + num);
		
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	
	public void callSale(){
		System.out.println("now is much than 100 *");
		mMediator.callSale();
	}
	
}
