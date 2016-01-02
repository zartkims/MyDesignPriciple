package com.cpl.adapter.class_adapter;

public class ClassAdapterMain {
	public static void main(String[] args) {
		IUserInfo userInfo = new UserOutUserAdapter();
		System.out.println(userInfo.getAge());
		userInfo = new ConcreteUserInfo();
		System.out.println(userInfo.getAge());
	}
}
