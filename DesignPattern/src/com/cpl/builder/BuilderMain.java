package com.cpl.builder;

public class BuilderMain {
	public static void main(String[] args) {
		Director director = new Director();
		director.getSweetCake1().cook();
		System.out.println();
		director.getSweetCake2().cook();System.out.println();
		director.getFiredFood().cook();
	}
}
