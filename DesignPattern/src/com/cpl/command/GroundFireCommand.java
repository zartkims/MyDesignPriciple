package com.cpl.command;

public class GroundFireCommand extends AttachCommand{
	
	//�����ֱ�ӵ�Ĭ��
	public GroundFireCommand() {
		super(new GroundForce());
	}
	//������������ִ����
	public GroundFireCommand(AttackExcutor excutor) {
		super(excutor);
	}

	@Override
	public void execute() {
		super.excutor.execute();
	}

}
