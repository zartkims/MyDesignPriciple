package com.cpl.response_chain;

public interface IHolidayRequest {
	public void setReason(String reason);
	public String getReason();
	public int getHolidayType();
	public int getHolidayDay();
	public void setHolidayDay(int day);
}
