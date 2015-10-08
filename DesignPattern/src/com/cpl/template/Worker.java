package com.cpl.template;

public abstract class Worker {
//	protected abstract void wakeUp();
	protected  void wakeUp(){System.out.println("Æð´²~\\(¨R¨Œ¨Q)/~À²À²À²");}
	protected abstract void haveBreakfast();
	protected abstract void goCompany();
	protected abstract void workLate();
	protected abstract void goHome();
	protected abstract boolean isHaveBreakfast();
	protected abstract boolean isWorklate();
	
	public final void throughADay(){
		wakeUp();
		if(isHaveBreakfast())haveBreakfast();
		goCompany();
		if(isWorklate())workLate();
		goHome();
	}
}
