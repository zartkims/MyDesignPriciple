package com.cpl.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个是制作food的人啦
 * @author king
 *
 */
public abstract class AbstractBuilder {
//	下面这个list应该放在product里经过考虑后决定，因为这个的话放在这回导致重复储存相同的数据
//	private List<Integer> order = new ArrayList<Integer>();
	
	/**
	 * 具体生成得到食物
	 * @return
	 */
	public abstract AbstractFood cookFood(List<Integer> recipe);
	
	
}
