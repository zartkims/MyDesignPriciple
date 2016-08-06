package com.cpl.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	Map<String, SamePart> samePool = new HashMap<String, SamePart>();
	
	public Infomation getInfo(String someThingDiff, String date, String weather) {
		SamePart sp = samePool.get(date + "_" + weather);
		if (null == sp) {
			sp = new SamePart(date, weather);
			samePool.put(date + "_" + weather, sp);
		} 
		return new Infomation(someThingDiff, sp);
	}
	
}

class Infomation {
	String someThingDiff;
	SamePart sampart;
	public Infomation(String someThingDiff, SamePart sampart) {
		this.someThingDiff = someThingDiff;
		this.sampart = sampart;
	}
	
}

class SamePart {
	String date;
	String weather;
	public SamePart() {}
	public SamePart(String date, String weather) {
		this.date = date;
		this.weather = weather;
	}
}
