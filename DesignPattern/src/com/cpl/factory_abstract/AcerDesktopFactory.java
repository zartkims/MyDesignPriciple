package com.cpl.factory_abstract;

public class AcerDesktopFactory implements IDesktopFactory{

	@Override
	public IMouse createMouse() {
		return new AcerMouse();
	}

	@Override
	public IKeyBoard createKeyBoard() {
		return new AcerKeyBoard();
	}

	@Override
	public IScreen createScreen() {
		return new AcerScreen();
	}

}
