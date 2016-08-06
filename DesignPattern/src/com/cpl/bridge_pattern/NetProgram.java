package com.cpl.bridge_pattern;

public class NetProgram implements Program {

	@Override
	public void loadProgram() {
		System.out.println("loadProgram .net project");
	}

	@Override
	public void compileProgram() {
		System.out.println("complie .net program");
	}

	@Override
	public void run() {
		System.out.println("run the .net program");
	}

}
