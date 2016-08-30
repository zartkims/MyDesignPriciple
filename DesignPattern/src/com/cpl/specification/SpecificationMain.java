package com.cpl.specification;

import java.util.ArrayList;
import java.util.List;

public class SpecificationMain {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java核心", "java, 计算机", 100));
		books.add(new Book("c++ Primer", "c++, 计算机", 80));
		books.add(new Book("Java 设计模式", "java, 计算机", 200));
		books.add(new Book("独孤九剑", "武功，牛X", 50));
		books.add(new Book("龟派气功", "武功, 异次元", 1000));
		books.add(new Book("咏春", "武功, 现实", 100));
		List<Book> result = new ArrayList<Book>();
		ISpecification<Book> priceSp = new BookPriceSpecification(50, 150);
		ISpecification<Book> typeSp = new BookTypeSpecification("计算机");
		for (Book b : books) {
			if (priceSp.and(typeSp).isSatisfiedBy(b)) result.add(b);
		}
		for (Book b : result) {
			System.out.println(b.name);
		}
		result.clear();
		System.out.println("==============");
		for (Book b : books) {
			if (priceSp.and(typeSp.not()).isSatisfiedBy(b)) result.add(b);
		}
		for (Book b : result) {
			System.out.println(b.name);
		}
	}
}
