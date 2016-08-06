package com.cpl.bridge_pattern;

public class LinuxPlatform extends Platform {

	public LinuxPlatform(Program pg) {
		super(pg);
	}

	@Override
	public void runTheProgram() {
		this.mProgram.loadProgram();
		System.out.println("linux ready to compile");
		this.mProgram.compileProgram();
		this.mProgram.run();
	}

}
