package com.cpl.specification;

/**
 * ����Ǿ����ҵ����
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
