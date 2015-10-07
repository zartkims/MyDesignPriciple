package com.cpl.ocp;

public class OffAnimationVideo extends AnimationVideo {
	public OffAnimationVideo(String name, String author, int price) {
		super(name, author, price);
	}
	@Override
	public int getPrice() {
		return (int) (super.getPrice()>4000?super.getPrice()*0.8:super.getPrice()*0.9);
	}
}
