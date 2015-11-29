package com.cpl.response_chain;

public class DepartmentLeader extends AbsHolidayHandler {

	public DepartmentLeader(int solveStatus, AbsHolidayHandler next) {
		super(solveStatus, next);
	}

	@Override
	protected String dealWithRequest(IHolidayRequest request) {
		return "department leader agree you beause " + request.getReason();
	}

	@Override
	protected boolean isDealWithSelf(IHolidayRequest request) {
		if(request.getHolidayType() == TeamLeader.LONG_HOLIDAY 
				&& (7 <= request.getHolidayDay() && request.getHolidayDay() < 30)){//Ò»ÔÂÄÚ
			return true;
		}
		return false;
	}
}
