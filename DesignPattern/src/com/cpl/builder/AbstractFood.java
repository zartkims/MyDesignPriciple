package com.cpl.builder;

import java.util.ArrayList;
import java.util.List;
/**
 * 介个food就用个模板方法吧
 * @author king
 *
 */
public abstract class AbstractFood {
	public static final int SUGER = 1;
	public static final int WATER = 2;
	public static final int SALT = 3;
	public static final int MUILK = 4;
	public static final int OIL = 5;
	
	protected abstract void addSalt(); 
	protected abstract void addSuger();
	protected abstract void addWater();
	protected abstract void addMuilk();
	protected abstract void addOil();
	//

	/**这个就相当于菜谱*/
	private List<Integer> order = new ArrayList<Integer>();
	public final void setOrder(List<Integer> recipe){this.order = recipe;}
	public final List<Integer> getOrder() {
		return order;
	}
	public final void cook(){
		for(Integer s :this.order){
			if(s == WATER)addWater();
			else if(s == SALT)addSalt();
			else if(s == SUGER)addSuger();
			else if(s == MUILK)addMuilk();
			else if(s == OIL)addOil();
		}
	}
}
