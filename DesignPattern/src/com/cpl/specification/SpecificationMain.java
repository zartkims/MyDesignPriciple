package com.cpl.specification;

import java.util.ArrayList;
import java.util.List;

public class SpecificationMain {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java����", "java, �����", 100));
		books.add(new Book("c++ Primer", "c++, �����", 80));
		books.add(new Book("Java ���ģʽ", "java, �����", 200));
		books.add(new Book("���¾Ž�", "�书��ţX", 50));
		books.add(new Book("��������", "�书, ���Ԫ", 1000));
		books.add(new Book("ӽ��", "�书, ��ʵ", 100));
		List<Book> result = new ArrayList<Book>();
		ISpecification<Book> priceSp = new BookPriceSpecification(50, 150);
		ISpecification<Book> typeSp = new BookTypeSpecification("�����");
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
