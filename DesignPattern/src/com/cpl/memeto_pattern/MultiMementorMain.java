package com.cpl.memeto_pattern;


public class MultiMementorMain {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		MultiStateOrigin origin = new MultiStateOrigin();
		origin.setName("kaka");
		origin.setAge(20);
		taker.addMemento("first", origin.createMementor());//������һ��״̬
		origin.setName("tutu");
		taker.addMemento("second", origin.createMementor());//�ڶ���״̬
		origin.setAge(21);
		origin.setName("kings");
		taker.addMemento("third", origin.createMementor());
		
		System.out.println(origin);
		origin.restoreMementor(taker.getMemento("second"));
		System.out.println(origin);
		origin.restoreMementor(taker.getMemento("first"));
		System.out.println(origin);
		origin.restoreMementor(taker.getMemento("third"));
		System.out.println(origin);
	}
}
