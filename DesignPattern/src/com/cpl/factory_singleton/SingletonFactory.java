package com.cpl.factory_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class SingletonFactory {
	private static MyTime myTime;
	private static MyIdea myIdea;
	static{
		try {
			//直接像下面这两个这样加载是不行的因为已经使用了private的构造器
//			myTime = (MyTime) Class.forName(MyTime.class.getName()).newInstance();
//			myIdea = (MyIdea) Class.forName(MyIdea.class.getName()).newInstance();
			
			Class timeClass = Class.forName(MyTime.class.getName());
			Constructor timeConstructor = timeClass.getDeclaredConstructor();
			timeConstructor.setAccessible(true);//强行让他能访问
			myTime = (MyTime) timeConstructor.newInstance();
			
			Class ideaClass = Class.forName(MyIdea.class.getName());
			Constructor ideaConstructor = ideaClass.getDeclaredConstructor();
			ideaConstructor.setAccessible(true);
			myIdea = (MyIdea) ideaConstructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//可以通过这样来模拟实现单例
	public static MyTime createMyTime(){return myTime;}
	public static MyIdea createMyIdea(){return myIdea;}
	
	public static void main(String[] args) {
		MyTime time = SingletonFactory.createMyTime();
		time.sayTime();
		System.out.println("end");
	}
}

class MyTime{
	private MyTime(){}
	public void sayTime(){System.out.println(new Date());}
}
class MyIdea{
	private MyIdea(){}
}