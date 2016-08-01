package com.cpl.visitor_pattern;

public class CounterImpl implements ICounter{
	private double mCount = 0;

	@Override
	public double getCounter() {
		return mCount;
	}

	@Override
	public void visit(Manager e) {
		mCount += e.salary * 1.5;
	}

	@Override
	public void visit(NormalEmployee ne) {
		mCount += ne.salary * 1.2;
	}

}
