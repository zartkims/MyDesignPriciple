package com.cpl.command;
/**
 * �����ִ����
 * @author king
 *
 */
public abstract class AttackExcutor {
	protected abstract void readyTheArmy();
	protected abstract void findTheEnemy();
	protected abstract void fire();
	public final void execute() {
		readyTheArmy();
		findTheEnemy();
		fire();
	}
	
}
