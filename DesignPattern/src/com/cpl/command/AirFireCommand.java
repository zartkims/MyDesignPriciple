package com.cpl.command;

public class AirFireCommand extends AttachCommand{
	
	//�����ֱ�ӵ�Ĭ��  �վ��Կվ�
	public AirFireCommand() {
		super(new AirForce());//ֱ�Ӽ�һ��Ĭ�Ϸ�װ����666
	}
	//������������ִ����
	public AirFireCommand(AttackExcutor excutor) {
		super(excutor);
	}

	@Override
	public void execute() {
		super.excutor.execute();
	}

}
