package com.cpl.proxy_dynamic2;

public class RealSubject implements Subject {

	@Override
	public void doSomething(String s) {
		System.out.println("dododo "+s);
	}

}
