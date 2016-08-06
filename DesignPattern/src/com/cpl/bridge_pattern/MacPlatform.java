package com.cpl.bridge_pattern;

public class MacPlatform extends Platform {

	public MacPlatform(Program pg) {
		super(pg);
	}

	@Override
	public void runTheProgram() {
		this.mProgram.loadProgram();
		System.out.println("mac ready to compile");
		this.mProgram.compileProgram();
		this.mProgram.run();
	}

}
