package com.cpl.response_chain;

public abstract class AbsHolidayHandler {
	public static final int SHORT_HOLIDAY = 1;
	public static final int MEDIUM_HOLIDAY = 2;
	public static final int LONG_HOLIDAY = 3;
	
	private int mSolveStatus = -1;
	private AbsHolidayHandler mNext = null;

	public final String solveTheRequest(IHolidayRequest request) {
		if (isDealWithSelf(request)) { //个人感觉这里如果像这样改为方法的话更好
			return dealWithRequest(request);
		} else if (mNext != null) {
			return mNext.solveTheRequest(request);
		} return "没有人说可以 那就是不可以咯 hiahiahiahia";
	}
	
	protected abstract String dealWithRequest(IHolidayRequest request);
	protected abstract boolean isDealWithSelf(IHolidayRequest request);
	
	public AbsHolidayHandler(int mSolveStatus, AbsHolidayHandler mNext) {
		super();
		this.mSolveStatus = mSolveStatus;
		this.mNext = mNext;
	}

	public int getmSolveStatus() {
		return mSolveStatus;
	}

	public void setmSolveStatus(int mSolveStatus) {
		this.mSolveStatus = mSolveStatus;
	}

	public AbsHolidayHandler getmNext() {
		return mNext;
	}

	public void setmNext(AbsHolidayHandler mNext) {
		this.mNext = mNext;
	}
	
	
}
