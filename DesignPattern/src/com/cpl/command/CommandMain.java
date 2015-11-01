package com.cpl.command;

public class CommandMain {
	public static void main(String[] args) {
		CommandInvoke invoke = new CommandInvoke();
		
		invoke.setCommand(new AirFireCommand());//空军打飞机
		invoke.action();
		invoke.setCommand(new GroundFireCommand());
		invoke.action();
		//下面是变种命令
		System.out.println("===========================");
		invoke.setCommand(new AirFireCommand(new GroundForce()));//陆军打飞机
		invoke.action();
	}
}
