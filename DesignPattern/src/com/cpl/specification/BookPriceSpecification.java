package com.cpl.specification;

public class BookPriceSpecification extends CompsingSpecification<Book> {
	int low;
	int hight;
	
	public BookPriceSpecification(int low, int hight) {
		this.low = low;
		this.hight = hight;
	}

	@Override
	public boolean isSatisfiedBy(Book t) {
		return this.low <= t.price && t.price <= this.hight;
	}
}
