package com.cpl.bridge_pattern;

public abstract class Platform {
	protected Program mProgram;
	
	public Platform(Program pg) {
		this.mProgram = pg;
	}
	
	public abstract void runTheProgram() ;
	
}
