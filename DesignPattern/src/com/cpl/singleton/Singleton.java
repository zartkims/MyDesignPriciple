package com.cpl.singleton;
/**�ϻ�����˵*/
public class Singleton {
	private static final Singleton instance = new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){return instance;}
}
