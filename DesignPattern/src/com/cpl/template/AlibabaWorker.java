package com.cpl.template;

public class AlibabaWorker extends Worker {
	boolean isWorkLate = false;
	boolean isHaveBrekfast = true;
//	@Override
//	protected void wakeUp() {
//		System.out.println("����������");
//	}

	@Override
	protected void haveBreakfast() {
		System.out.println("�����ĳ����");
	}

	@Override
	protected void goCompany() {
		System.out.println("���ߵĵ����ϰ�");
	}

	@Override
	protected void workLate() {
		System.out.println("���ǰɣ��ּӰ�");
	}

	@Override
	protected void goHome() {
		System.out.println("�����ؼ�");
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
