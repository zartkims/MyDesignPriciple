package com.cpl.observer_my;

public class ObserverMain {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.addObserver(new Deer("����"));
		tiger.addObserver(new Deer("����"));
		tiger.addObserver(new Deer("ͻͻ"));
		tiger.addObserver(new Deer("����"));
		tiger.addObserver(new Deer("žž"));
		tiger.addObserver(new Deer("����"));
		tiger.addObserver(new Deer("���"));
		tiger.play();
		tiger.hunt();
		tiger.huntQuietly();
		tiger.play();
		tiger.hunt();
	}
}
