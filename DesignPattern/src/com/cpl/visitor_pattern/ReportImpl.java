package com.cpl.visitor_pattern;

public class ReportImpl implements IReport {
	String info;

	@Override
	public void visit(Manager m) {
		info += m.name + " " + m.comment;
	}

	@Override
	public void visit(NormalEmployee ne) {
		info += ne.name + " " + ne.job;
	}

	@Override
	public void report() {
		System.out.println(info);
	}
}
