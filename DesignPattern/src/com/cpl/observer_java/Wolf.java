package com.cpl.observer_java;

import java.util.Observable;

public class Wolf extends Observable {
	String name = "小狼恰恰";
	public void play() {
		System.out.println("奏素玩的开森~...");
		setChanged();
		notifyObservers("play");
	}
	public void hunt() {
		System.out.println("独自去打猎啊啊啊~......");
		setChanged();
		notifyObservers("huntLonely");
	}
	public void huntTogether() {
		System.out.println("俺要和小伙伴们一起上 才能抓住 小兔砸~~...");
		setChanged();
		notifyObservers("huntToget");
	}
	
	@Override
	public String toString() {
		return "小狼qiaqia";
	}
}
