package com.cpl.command;
/**
 * �൱��һ����ͷ��
 * @author king
 *
 */
public class CommandInvoke {
	private AttachCommand command;

	public AttachCommand getCommand() {
		return command;
	}

	public void setCommand(AttachCommand command) {
		this.command = command;
	}

	public void action() {
		command.execute();
	}
	
}
