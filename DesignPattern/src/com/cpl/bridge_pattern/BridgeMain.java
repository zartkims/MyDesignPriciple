package com.cpl.bridge_pattern;

public class BridgeMain {
	public static void main(String[] args) {
		Program javaPg = new JavaProgram();
		Program cppPg = new CPPProgram();
		Program netPg = new NetProgram();
		Platform windowsNet = new WindowsPlatform((NetProgram) netPg);
		Platform macJava = new MacPlatform(javaPg);
		Platform macCPP = new MacPlatform(cppPg);
		windowsNet.runTheProgram();
		System.out.println();
		macJava.runTheProgram();
		System.out.println();
		macCPP.runTheProgram();
		
	
	}
}
