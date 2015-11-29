package com.cpl.response_chain;

public class GroupLeader extends AbsHolidayHandler {

	public GroupLeader(int solveStatus, AbsHolidayHandler next) {
		super(solveStatus, next);
	}

	@Override
	protected String dealWithRequest(IHolidayRequest request) {
		return "group leader agree you beause " + request.getReason();
	}

	@Override
	protected boolean isDealWithSelf(IHolidayRequest request) {
		if(request.getHolidayType() == TeamLeader.MEDIUM_HOLIDAY 
				&& (3 <= request.getHolidayDay() && request.getHolidayDay() < 7)){//Ò»ÐÇÆÚÄÚ
			return true;
		}
		return false;
	}
}
