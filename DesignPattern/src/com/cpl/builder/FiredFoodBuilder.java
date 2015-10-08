package com.cpl.builder;

import java.util.List;

public class FiredFoodBuilder extends AbstractBuilder {
	@Override
	public FiredFood cookFood(List<Integer> recipe) {
		FiredFood firedFood = new FiredFood();
		firedFood.setOrder(recipe);
		return firedFood ;
	}

}
