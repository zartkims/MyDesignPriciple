package com.cpl.command;
/**
 * 相当于一个接头人
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
