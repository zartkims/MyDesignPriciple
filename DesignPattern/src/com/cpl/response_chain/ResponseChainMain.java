package com.cpl.response_chain;


public class ResponseChainMain {
	public static void main(String[] args) {
		AbsHolidayHandler handler 
			= new TeamLeader(AbsHolidayHandler.SHORT_HOLIDAY
					, new GroupLeader(AbsHolidayHandler.MEDIUM_HOLIDAY
							, new DepartmentLeader(AbsHolidayHandler.LONG_HOLIDAY, null)));
		String result = "";
		//正常短假
		result = handler.solveTheRequest(new HolidayRequest("身体不适", AbsHolidayHandler.SHORT_HOLIDAY ,2));
		System.out.println(result);
		//正常中假
		result = handler.solveTheRequest(new HolidayRequest("外出办事", AbsHolidayHandler.MEDIUM_HOLIDAY ,5));
		System.out.println(result);
		//正常长假
		result = handler.solveTheRequest(new HolidayRequest("出国办事", AbsHolidayHandler.LONG_HOLIDAY ,15));
		System.out.println(result);
		//不正常长假
		result = handler.solveTheRequest(new HolidayRequest("出国办事", AbsHolidayHandler.LONG_HOLIDAY ,150));
		System.out.println(result);
		//不正常长假
		result = handler.solveTheRequest(new HolidayRequest("出国办事", AbsHolidayHandler.SHORT_HOLIDAY ,15));
		System.out.println(result);
	}
}
