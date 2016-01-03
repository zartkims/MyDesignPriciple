package com.cpl.observer_java;

public class ObsMain {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.addObserver(new Sheep("����"));
		wolf.addObserver(new Sheep("����"));
		wolf.addObserver(new Sheep("����"));
		wolf.addObserver(new Sheep("¶¶"));
		wolf.addObserver(new Sheep("���"));
		wolf.play();
		wolf.hunt();
		wolf.huntTogether();
	}
}
