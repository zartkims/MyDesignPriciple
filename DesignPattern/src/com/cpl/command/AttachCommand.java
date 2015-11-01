package com.cpl.command;

public abstract class AttachCommand {
	protected AttackExcutor excutor;
	public AttachCommand(AttackExcutor excutor) {
		super();
		this.excutor = excutor;
	}

	public abstract void execute();
//	public abstract void unExecute();这个相当于一个撤销 这里就不实现了 比如让军队回来之类的
	
}
