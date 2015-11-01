package com.cpl.command;

public class GroundFireCommand extends AttachCommand{
	
	//这个是直接的默认
	public GroundFireCommand() {
		super(new GroundForce());
	}
	//可以重新设置执行者
	public GroundFireCommand(AttackExcutor excutor) {
		super(excutor);
	}

	@Override
	public void execute() {
		super.excutor.execute();
	}

}
