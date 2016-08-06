package com.cpl.bridge_pattern;

public class JavaProgram implements Program {

	@Override
	public void loadProgram() {
		System.out.println("loadProgram java project");
	}

	@Override
	public void compileProgram() {
		System.out.println("complie java program");
	}

	@Override
	public void run() {
		System.out.println("run the java program");
	}

}
