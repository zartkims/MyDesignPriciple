package com.cpl.specification;

import java.util.Date;

public class Book {
	
	public Book() {
	}
	
	public Book(String name, String type, float price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}


	public String name;
	public String type;
	public float price;
	public Date date;
	public String author;
}
