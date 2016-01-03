package com.cpl.observer_java;

import java.util.Observable;
import java.util.Observer;

public class Sheep implements Observer{
	private String name ;
	
	public Sheep(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (arg.equals("huntLonely")){
			System.out.println(name +" : 只有一只狼~...狗狗上~...");
		} else {
			System.out.println(name + " : shenmegui 赶紧跑");
		} 
	}

}
