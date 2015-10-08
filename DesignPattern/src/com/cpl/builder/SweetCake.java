package com.cpl.builder;
/**
 * 甜甜哒蛋糕
 * @author king
 *
 */
public class SweetCake extends AbstractFood {

	@Override
	protected void addSalt() {
		System.out.println("甜蛋糕为啥要放盐~");
	}

	@Override
	protected void addSuger() {
		System.out.println("糖糖糖");
	}

	@Override
	protected void addWater() {
		System.out.println("水还是要的");
	}

	@Override
	protected void addMuilk() {
		System.out.println("牛奶也要啊啊");
	}

	@Override
	protected void addOil() {
		System.out.println("奶油的话也是可以放的，黄油也丢点");
	}

}
