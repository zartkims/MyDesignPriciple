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
			System.out.println(name +" : ֻ��һֻ��~...������~...");
		} else {
			System.out.println(name + " : shenmegui �Ͻ���");
		} 
	}

}
