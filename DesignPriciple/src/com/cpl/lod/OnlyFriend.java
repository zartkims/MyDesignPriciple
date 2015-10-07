package com.cpl.lod;

import java.util.ArrayList;
import java.util.List;

public class OnlyFriend {

}

/**
 * 像下面这样写的话就没有弄好 之和朋友说话的原则 
 * 以为老师中引入了Gril类，这就不是很好了
 * 更好的应该是像下下面这样
 * @author king
 *
 */
class Teacher{
	public void sortTheGrils(ClassLeader leader){
		List<Gril> grils = new ArrayList<Gril>();
		for(int i=0;i<20;i++){grils.add(new Gril());}
		leader.sort(grils);
	}
}
class ClassLeader{
	public void sort(List<Gril> grils){System.out.println("大家排好队");}
}
class Gril{}

/**
 * 这样的话就比较好了老师没有直接和Gril打交道 只和朋友leader打交道
 * @author king
 *
 */
class Teacher2{
	public void sortTheGrils(ClassLeader2 leader){
		leader.sort();
	}
}
class ClassLeader2{
	public void sort(){
		List<Gril> grils = new ArrayList<Gril>();
		for(int i=0;i<20;i++){grils.add(new Gril());
	}
		System.out.println("大家排好队");}
}