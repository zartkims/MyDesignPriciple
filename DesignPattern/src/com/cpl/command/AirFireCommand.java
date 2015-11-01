package com.cpl.command;

public class AirFireCommand extends AttachCommand{
	
	//这个是直接的默认  空军对空军
	public AirFireCommand() {
		super(new AirForce());//直接加一个默认封装真素666
	}
	//可以重新设置执行者
	public AirFireCommand(AttackExcutor excutor) {
		super(excutor);
	}

	@Override
	public void execute() {
		super.excutor.execute();
	}

}
