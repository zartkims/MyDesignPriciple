package com.cpl.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * ����൱�ڿͻ�������Ҫ��ô���Ķ���
 * @author king
 *
 */
public class Director {
	AbstractBuilder cakeBuilder = new CakeBuilder();
	AbstractBuilder firedFoodBuilder = new FiredFoodBuilder();
	List<Integer> order = new ArrayList<Integer>();
	/**��һ�ֵ���*/
	public SweetCake getSweetCake1(){
		this.order.clear();//����������
		this.order.add(AbstractFood.MUILK);
		this.order.add(AbstractFood.SUGER);
		this.order.add(AbstractFood.SUGER);
		this.order.add(AbstractFood.MUILK);
		this.order.add(AbstractFood.SALT);
		return (SweetCake) cakeBuilder.cookFood(this.order);
	}
	/**��һ�ֵ���*/
	public SweetCake getSweetCake2(){
		order.clear();
		this.order.add(AbstractFood.MUILK);
		this.order.add(AbstractFood.MUILK);
		this.order.add(AbstractFood.SUGER);
		this.order.add(AbstractFood.SALT);
		return (SweetCake) cakeBuilder.cookFood(this.order);
	}
	
	/**����ը��ʳƷ*/
	public FiredFood getFiredFood(){
		this.order.clear();
		this.order.add(AbstractFood.OIL);
		this.order.add(AbstractFood.OIL);
		this.order.add(AbstractFood.SALT);
		return (FiredFood) firedFoodBuilder.cookFood(this.order);
	}
	
}
