package com.cpl.response_chain;


public class ResponseChainMain {
	public static void main(String[] args) {
		AbsHolidayHandler handler 
			= new TeamLeader(AbsHolidayHandler.SHORT_HOLIDAY
					, new GroupLeader(AbsHolidayHandler.MEDIUM_HOLIDAY
							, new DepartmentLeader(AbsHolidayHandler.LONG_HOLIDAY, null)));
		String result = "";
		//�����̼�
		result = handler.solveTheRequest(new HolidayRequest("���岻��", AbsHolidayHandler.SHORT_HOLIDAY ,2));
		System.out.println(result);
		//�����м�
		result = handler.solveTheRequest(new HolidayRequest("�������", AbsHolidayHandler.MEDIUM_HOLIDAY ,5));
		System.out.println(result);
		//��������
		result = handler.solveTheRequest(new HolidayRequest("��������", AbsHolidayHandler.LONG_HOLIDAY ,15));
		System.out.println(result);
		//����������
		result = handler.solveTheRequest(new HolidayRequest("��������", AbsHolidayHandler.LONG_HOLIDAY ,150));
		System.out.println(result);
		//����������
		result = handler.solveTheRequest(new HolidayRequest("��������", AbsHolidayHandler.SHORT_HOLIDAY ,15));
		System.out.println(result);
	}
}
