package com.cpl.factory_abstract;

public interface IDesktopFactory {
	public IMouse createMouse();
	public IKeyBoard createKeyBoard();
	public IScreen createScreen();
}
