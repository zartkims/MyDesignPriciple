package com.cpl.decorate;

public abstract class AirEquipment implements IAirplane {
	private IAirplane mAirplane;
	
	@Override
	public void fire() {
		preFire();
		if (mAirplane != null) mAirplane.fire();
	}

	@Override
	public void speedUp() {
		preSpeedUp();
		if (mAirplane != null) mAirplane.speedUp();
	}

	protected abstract void preFire();
	protected abstract void preSpeedUp();
	
	public IAirplane getmAirplane() {
		return mAirplane;
	}

	public void setmAirplane(IAirplane mAirplane) {
		this.mAirplane = mAirplane;
	}

	public AirEquipment(IAirplane mAirplane) {
		this.mAirplane = mAirplane;
	}


	
}
