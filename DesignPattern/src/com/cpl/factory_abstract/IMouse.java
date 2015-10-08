package com.cpl.factory_abstract;
/**
 * 鼠标吧
 * @author king
 *
 */
public abstract class IMouse {
	public void move(){System.out.println("鼠标肯定能懂啊");}
	/**鼠标的造型肯定都不一样*/
	public abstract void shape();
}
