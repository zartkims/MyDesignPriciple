package com.cpl.ocp;

/**
 * 现在假如要实行打折的策略
 * 那么对变化的修改有几种策略
 * 1.修改IVideo接口,不好显然
 * 2.修改本类的getPrice方法,这个还行 但是 不算完美可能会导致一些测试上或者其他引用了的问题（该例子比较简单所以没问题）
 * 3.继承本类来进行修改，这个就是OCP原则
 * @author king
 *
 */
public class AnimationVideo implements IVideo{
	private String name;
	private String author;
	private int price;
	
	public AnimationVideo(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public int getPrice() {
//		return (int) (price>4000?price*0.8:price*0.9);//这样的话就是直接修改本身来适应变化
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAuthor() {
		return author;
	}

}
