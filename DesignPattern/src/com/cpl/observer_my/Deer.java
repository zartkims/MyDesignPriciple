package com.cpl.observer_my;

public class Deer implements IMyObserver{
	private String name ;
	@Override
	public void update(IMyObserverable observable, String strInfo) {
		if (strInfo.equals("����")) {
			System.out.println(this.name +" : �Ͻ���ô�ܰ�!!,����������~...");
		} else {
			System.out.println(this.name + " ������ " + strInfo + "����ë��~..");
		}
	}
	public Deer(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
