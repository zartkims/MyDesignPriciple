package com.cpl.response_chain;

public class TeamLeader extends AbsHolidayHandler {

	public TeamLeader(int mSolveStatus, AbsHolidayHandler mNext) {
		super(mSolveStatus, mNext);
	}
	
	@Override
	protected String dealWithRequest(IHolidayRequest request) {
		return "team leader agree you beause " + request.getReason();
	}

	@Override
	protected boolean isDealWithSelf(IHolidayRequest request) {
		if(request.getHolidayType() == TeamLeader.SHORT_HOLIDAY 
				&& (0 < request.getHolidayDay() && request.getHolidayDay() < 3)){ //������
//			������ܻ����Զ��������һЩ���� ���� 
			return true;
		}
		request.setReason(request.getReason() + " team leader had knew");
		return false;
	}

}
