package com.cpl.observer_my;

import java.util.ArrayList;
import java.util.List;


public class Tiger implements IMyObserverable{
	private List<IMyObserver> observers = new ArrayList<IMyObserver>();
	@Override
	public void addObserver(IMyObserver observer) {
		if (!observers.contains(observer)) observers.add(observer);
	}

	@Override
	public void deleteObserver(IMyObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAll(String info) {
		for (IMyObserver obs : observers) {
			obs.update(this, info);
		}
	}
	
	public void play() {
		System.out.println("������~....��Ŀ��ĵ�������~....");
		notifyAll("��ˣ");
	}
	public void hunt() {
		System.out.println("ȥ����������~.....");
		notifyAll("����");
	}
	public void huntQuietly() {
		System.out.println("������ȥ�����չ�����~....");
		int index = (int) (Math.random() * observers.size()) ;
		System.out.println("hiahiahia~...ץ�� " + observers.get(index) + "��~..");
		deleteObserver(observers.get(index));//���ڵ�~\(�R���Q)/~������
	}

	@Override
	public String toString() {
		return "С�ϻ�~";
	}
}
