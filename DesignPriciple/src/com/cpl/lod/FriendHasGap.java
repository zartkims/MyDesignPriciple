package com.cpl.lod;
/**
 * 这个主要是想说明 朋友间也是有距离的
 * @author king
 *
 */
public class FriendHasGap {
	public static void main(String[] args) {
		new InitTheSoft2().initIt(new Wizard2());//仅仅为了好玩
	}
}

/**
 * 下面这样的编程的话很明显的就是朋友之间太亲密了
 * 而且很明显的就是内聚性不算特别高
 * @author king
 *
 */
class InitTheSoft{
	public void initIt(Wizard wizard){
		if(wizard.first())
			if(wizard.second())
				if(wizard.third())
					System.out.println("安装完成");
	}
}

class Wizard{
	public boolean first(){return true;}
	public boolean second(){return true;}
	public boolean third(){return true;}
}
/**
 * 像下面这样的话明显会更好
 * @author king
 *
 */
class InitTheSoft2{
	public void initIt(Wizard2 wizard){
		wizard.init();
		if(wizard.init())System.out.println("成功");
		else System.out.println("fail");
	}
}

class Wizard2{
	private boolean first(){return true;}
	private boolean second(){return true;}
	private boolean third(){return true;}
	public boolean init(){
//		if(first())
//			if(second())
//				if(third())
//					return true;
		return first()?second()?third()?true:false:false:false;//日这样也行 我真特么帅
	}
}

