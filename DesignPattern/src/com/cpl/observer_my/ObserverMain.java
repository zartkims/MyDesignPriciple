package com.cpl.observer_my;

public class ObserverMain {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.addObserver(new Deer("µ°µ°"));
		tiger.addObserver(new Deer("ßÇßÇ"));
		tiger.addObserver(new Deer("Í»Í»"));
		tiger.addObserver(new Deer("À²À²"));
		tiger.addObserver(new Deer("Å¾Å¾"));
		tiger.addObserver(new Deer("¶ª¶ª"));
		tiger.addObserver(new Deer("±í±í"));
		tiger.play();
		tiger.hunt();
		tiger.huntQuietly();
		tiger.play();
		tiger.hunt();
	}
}
