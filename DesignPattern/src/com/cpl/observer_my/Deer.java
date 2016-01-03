package com.cpl.observer_my;

public class Deer implements IMyObserver{
	private String name ;
	@Override
	public void update(IMyObserverable observable, String strInfo) {
		if (strInfo.equals("捕猎")) {
			System.out.println(this.name +" : 赶紧特么跑啊!!,吓死宝宝了~...");
		} else {
			System.out.println(this.name + " 看见在 " + strInfo + "关我毛事~..");
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
