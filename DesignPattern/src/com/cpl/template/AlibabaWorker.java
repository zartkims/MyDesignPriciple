package com.cpl.template;

public class AlibabaWorker extends Worker {
	boolean isWorkLate = false;
	boolean isHaveBrekfast = true;
//	@Override
//	protected void wakeUp() {
//		System.out.println("正常的起床了");
//	}

	@Override
	protected void haveBreakfast() {
		System.out.println("正常的吃早餐");
	}

	@Override
	protected void goCompany() {
		System.out.println("悲催的地铁上班");
	}

	@Override
	protected void workLate() {
		System.out.println("不是吧，又加班");
	}

	@Override
	protected void goHome() {
		System.out.println("正常回家");
	}

	@Override
	protected boolean isHaveBreakfast() {
		return isHaveBrekfast;
	}

	@Override
	protected boolean isWorklate() {
		return isWorkLate;
	}
	
	public static void main(String[] args) {
		Worker w = new AlibabaWorker();
		w.throughADay();
	}
}
