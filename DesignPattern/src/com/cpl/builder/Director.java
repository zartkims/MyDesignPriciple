package com.cpl.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 这就相当于客户告诉你要怎么样的东西
 * @author king
 *
 */
public class Director {
	AbstractBuilder cakeBuilder = new CakeBuilder();
	AbstractBuilder firedFoodBuilder = new FiredFoodBuilder();
	List<Integer> order = new ArrayList<Integer>();
	/**第一种蛋糕*/
	public SweetCake getSweetCake1(){
		this.order.clear();//清空脏的数据
		this.order.add(AbstractFood.MUILK);
		this.order.add(AbstractFood.SUGER);
		this.order.add(AbstractFood.SUGER);
		this.order.add(AbstractFood.MUILK);
		this.order.add(AbstractFood.SALT);
		return (SweetCake) cakeBuilder.cookFood(this.order);
	}
	/**第一种蛋糕*/
	public SweetCake getSweetCake2(){
		order.clear();
		this.order.add(AbstractFood.MUILK);
		this.order.add(AbstractFood.MUILK);
		this.order.add(AbstractFood.SUGER);
		this.order.add(AbstractFood.SALT);
		return (SweetCake) cakeBuilder.cookFood(this.order);
	}
	
	/**制作炸的食品*/
	public FiredFood getFiredFood(){
		this.order.clear();
		this.order.add(AbstractFood.OIL);
		this.order.add(AbstractFood.OIL);
		this.order.add(AbstractFood.SALT);
		return (FiredFood) firedFoodBuilder.cookFood(this.order);
	}
	
}
