package com.cpl.mediator_pattern;

public abstract class AbstractMediator {
	protected Sales mSales;
	protected Stock mStock;
	protected Buyer mBuyer;
	
	public Sales getmSales() {
		return mSales;
	}
	public void setmSales(Sales mSales) {
		this.mSales = mSales;
	}
	public Stock getmStock() {
		return mStock;
	}
	public void setmStock(Stock mStock) {
		this.mStock = mStock;
	}
	public Buyer getmBuyer() {
		return mBuyer;
	}
	public void setmBuyer(Buyer mBuyer) {
		this.mBuyer = mBuyer;
	}
	
	
}
