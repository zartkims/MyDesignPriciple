package com.cpl.command;
/**
 * 空军用于接受命令
 * @author king
 *
 */
public class AirForce extends AttackExcutor{
	public void readyTheArmy() {
		System.out.println("飞机准备起飞");
	}
	public void findTheEnemy() {
		System.out.println("发现敌军");
	}
	public void fire() {
		System.out.println("奏素干...biubiubiu~..");
	}

}
