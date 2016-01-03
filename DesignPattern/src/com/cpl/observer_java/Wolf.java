package com.cpl.observer_java;

import java.util.Observable;

public class Wolf extends Observable {
	String name = "С��ǡǡ";
	public void play() {
		System.out.println("������Ŀ�ɭ~...");
		setChanged();
		notifyObservers("play");
	}
	public void hunt() {
		System.out.println("����ȥ���԰�����~......");
		setChanged();
		notifyObservers("huntLonely");
	}
	public void huntTogether() {
		System.out.println("��Ҫ��С�����һ���� ����ץס С����~~...");
		setChanged();
		notifyObservers("huntToget");
	}
	
	@Override
	public String toString() {
		return "С��qiaqia";
	}
}
