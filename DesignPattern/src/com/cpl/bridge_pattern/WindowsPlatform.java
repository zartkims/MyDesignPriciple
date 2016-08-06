package com.cpl.bridge_pattern;

public class WindowsPlatform extends Platform {

	/**
	 * only .net program in here
	 * @param pg
	 */
	public WindowsPlatform(NetProgram pg) {
		super(pg);
	}

	@Override
	public void runTheProgram() {
		this.mProgram.loadProgram();
		System.out.println("windows ready to compile");
		this.mProgram.compileProgram();
		this.mProgram.run();
	}

}
