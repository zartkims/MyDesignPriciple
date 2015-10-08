package com.cpl.factory_easy;

public class YellowHuman implements IHuman{

	@Override
	public void say() {
		System.out.println("speak double words");
	}

	@Override
	public void displayColor() {
		System.out.println("i am yellow");
	}

}
