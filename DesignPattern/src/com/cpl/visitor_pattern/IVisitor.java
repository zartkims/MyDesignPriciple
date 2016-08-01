package com.cpl.visitor_pattern;

public interface IVisitor {

	void visit(Manager m);
	
	void visit(NormalEmployee ne);
}
