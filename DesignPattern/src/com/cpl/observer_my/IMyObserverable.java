package com.cpl.observer_my;

public interface IMyObserverable {
	public void addObserver(IMyObserver observer);
	public void deleteObserver(IMyObserver observer);
	public void notifyAll(String info);
	
}
