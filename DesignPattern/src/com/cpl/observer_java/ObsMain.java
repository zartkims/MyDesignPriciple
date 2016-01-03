package com.cpl.observer_java;

public class ObsMain {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.addObserver(new Sheep("ÔúÔú"));
		wolf.addObserver(new Sheep("¹ş¹ş"));
		wolf.addObserver(new Sheep("ßãßã"));
		wolf.addObserver(new Sheep("Â¶Â¶"));
		wolf.addObserver(new Sheep("¸â¸â"));
		wolf.play();
		wolf.hunt();
		wolf.huntTogether();
	}
}
