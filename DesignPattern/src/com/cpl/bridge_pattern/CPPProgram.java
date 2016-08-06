package com.cpl.bridge_pattern;

public class CPPProgram implements Program {

	@Override
	public void loadProgram() {
		System.out.println("loadProgram c++ project");
	}

	@Override
	public void compileProgram() {
		System.out.println("complie c++ program");
	}

	@Override
	public void run() {
		System.out.println("run the c++ program");
	}

}
