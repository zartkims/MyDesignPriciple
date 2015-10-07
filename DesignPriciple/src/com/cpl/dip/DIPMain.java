package com.cpl.dip;

/**
 * 可以参考下策略模式，不在赘述
 * @author king
 *
 */
public class DIPMain {
	public static void main(String[] args) {
		IDriver driver = new ConcreteDriver();
		driver.drive(new BMW());//这个使用的接口注入的方式
		//另外两种注入方式是 构造器注入 和 setter注入
		//使用setter注入的话就是完全的策略模式了 算了我加上吧
		driver.setCar(new Benze());
		driver.drive();
	}
}
