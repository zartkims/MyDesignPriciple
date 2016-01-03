package com.cpl.observer_my;

import java.util.ArrayList;
import java.util.List;


public class Tiger implements IMyObserverable{
	private List<IMyObserver> observers = new ArrayList<IMyObserver>();
	@Override
	public void addObserver(IMyObserver observer) {
		if (!observers.contains(observer)) observers.add(observer);
	}

	@Override
	public void deleteObserver(IMyObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAll(String info) {
		for (IMyObserver obs : observers) {
			obs.update(this, info);
		}
	}
	
	public void play() {
		System.out.println("À²À²À²~....ÍæµÄ¿ªÐÄµÄÑù×ÓÄØ~....");
		notifyAll("ÍæË£");
	}
	public void hunt() {
		System.out.println("È¥ÕÒßÚßÕà»à»à»à»~.....");
		notifyAll("²¶ÁÔ");
	}
	public void huntQuietly() {
		System.out.println("¾²¾²µÄÈ¥ÕÒßÚßÕ¹þ¹þ¹þ~....");
		int index = (int) (Math.random() * observers.size()) ;
		System.out.println("hiahiahia~...×¥µ½ " + observers.get(index) + "ÁË~..");
		deleteObserver(observers.get(index));//±»ßÚµô~\(¨R¨Œ¨Q)/~À²À²À²
	}

	@Override
	public String toString() {
		return "Ð¡ÀÏ»¢~";
	}
}
