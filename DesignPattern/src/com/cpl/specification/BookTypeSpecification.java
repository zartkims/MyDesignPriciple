package com.cpl.specification;

/**
 * 这个是具体的业务类
 * @author caipengli
 *
 */
public class BookTypeSpecification extends CompsingSpecification<Book> {
	String type;

	public BookTypeSpecification(String type) {
		this.type = type;
	}


	@Override
	public boolean isSatisfiedBy(Book t) {
		return t.type.contains(type);
	}
}
