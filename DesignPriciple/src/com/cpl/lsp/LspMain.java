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
		//����ֱ���滻�ɸ�����ȫû���쳣���֣�����LSP
		son.doSomething(hash);
		father.doSomething(hash);
		
		//������Կ�������ֱ���滻�ɸ����ʱ�����������
//		���ಢû����д������ķ���������������õ�ȴ�ǲ�ͬ�ڸ���ģ��������ʵ�����Ǹ��߼�����
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
	 * ����������������ԷŴ��ǶԵģ��������LSP��ԭ��
	 * ��������ز�����д
	 * @param map
	 * @return
	 */
	public Collection<String> doSomething(Map<String, String> map){
		System.out.println("son do something");
		return map.values();
	}
	
	/**
	 * �����Ļ�Ҳ������
	 * ���������Ļ���������LSPԭ��
	 * @param hash
	 * @return
	 */
	public Collection<String>  errDoSomething(HashMap<String, String> hash){
		System.out.println("son error do something");
		return hash.values();
	}
	
}