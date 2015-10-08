package com.cpl.factory_easy;

public class BlackHuman implements IHuman{

	@Override
	public void say() {
		System.out.println("speak diffcult words");
	}

	@Override
	public void displayColor() {
		System.out.println("i am black");
	}

}
