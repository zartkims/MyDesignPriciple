package com.cpl.command;

public class CommandMain {
	public static void main(String[] args) {
		CommandInvoke invoke = new CommandInvoke();
		
		invoke.setCommand(new AirFireCommand());//�վ���ɻ�
		invoke.action();
		invoke.setCommand(new GroundFireCommand());
		invoke.action();
		//�����Ǳ�������
		System.out.println("===========================");
		invoke.setCommand(new AirFireCommand(new GroundForce()));//½����ɻ�
		invoke.action();
	}
}
