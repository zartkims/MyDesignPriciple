package com.cpl.factory_easy;

public class WhiteHuman implements IHuman{

	@Override
	public void say() {
		System.out.println("speak single words");
	}

	@Override
	public void displayColor() {
		System.out.println("i am white");
	}

}
