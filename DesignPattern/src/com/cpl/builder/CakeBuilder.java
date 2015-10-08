package com.cpl.builder;

import java.util.List;

public class CakeBuilder extends AbstractBuilder {
	@Override
	public SweetCake cookFood(List<Integer> recipe) {
		SweetCake cake = new SweetCake();
//		不应该在这里就cook了，这里只是新建对象不是cook东西
//		因此应该有个不合理 所以List应该存放在 product里而不是 builder里
//		cake.cook(getOrder());
		cake.setOrder(recipe);
		return cake ;
	}


}
