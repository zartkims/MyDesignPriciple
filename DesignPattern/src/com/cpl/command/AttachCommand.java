package com.cpl.command;

public abstract class AttachCommand {
	protected AttackExcutor excutor;
	public AttachCommand(AttackExcutor excutor) {
		super();
		this.excutor = excutor;
	}

	public abstract void execute();
//	public abstract void unExecute();����൱��һ������ ����Ͳ�ʵ���� �����þ��ӻ���֮���
	
}
