package com.cpl.adapter.class_adapter;

import java.util.Date;

/**
 * ���������ⲿ��һ��ϵͳ�� user
 * @author king
 *
 */
public class OutSideUser {
	public int getMySex() {
		return 1;// 0Ϊ�� 1Ů
	}
	
	public Date getBirthDay() {
		return new Date();
	}
	
	public String getMyName() {
		return "zhang shan";
	}
}
