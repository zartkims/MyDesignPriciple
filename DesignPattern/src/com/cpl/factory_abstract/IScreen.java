package com.cpl.factory_abstract;
/**
 * 介个当做是屏幕
 * @author king
 *
 */
public abstract class IScreen {
	public void show(){System.out.println("屏幕正常就是展示的");}
	/**不同的屏幕有不同的分辨率*/
	public abstract void showPix();
}
