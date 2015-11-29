package com.cpl.response_chain;

public class HolidayRequest implements IHolidayRequest {
	private String mReason;
	private int mStatus;
	private int holidayDay;


	public HolidayRequest(String mReason, int mStatus, int holidayDay) {
		super();
		this.mReason = mReason;
		this.mStatus = mStatus;
		this.holidayDay = holidayDay;
	}

	public HolidayRequest() {
		super();
	}

	public String getReason() {
		return mReason;
	}

	public void setReason(String reason) {
		this.mReason = reason;
	}

	public int getHolidayDay() {
		return holidayDay;
	}

	public void setHolidayDay(int holidayDay) {
		this.holidayDay = holidayDay;
	}

	@Override
	public int getHolidayType() {
		return mStatus;
	}
}
