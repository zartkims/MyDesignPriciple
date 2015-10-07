package com.cpl.lsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LspMain {
	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();
		
		Father father = new Father();
		Son son = new Son();
		//
		//子类直接替换成父类完全没有异常出现，符合LSP
		son.doSomething(hash);
		father.doSomething(hash);
		
		//下面可以看出子类直接替换成父类的时候出现了问题
//		子类并没有重写！父类的方法，但是子类调用的却是不同于父类的，因此这里实际上是个逻辑错误
		son.errDoSomething(hash);
		father.errDoSomething(hash);
	}
}

class Father{
	public Collection<String> doSomething(HashMap<String, String> hash){
		System.out.println("father do something");
		return hash.values();
	}
	public Collection<String>  errDoSomething(Map<String, String> map){
		System.out.println("father error do something");
		return map.values();
	}
	
}
class Son extends Father{
	/**
	 * 子类的输入条件可以放大是对的，这个符合LSP的原则
	 * 这个是重载不是重写
	 * @param map
	 * @return
	 */
	public Collection<String> doSomething(Map<String, String> map){
		System.out.println("son do something");
		return map.values();
	}
	
	/**
	 * 这样的话也是重载
	 * 但是这样的话不能满足LSP原则
	 * @param hash
	 * @return
	 */
	public Collection<String>  errDoSomething(HashMap<String, String> hash){
		System.out.println("son error do something");
		return hash.values();
	}
	
}