package com.cpl.adapter.class_adapter;

import java.util.Date;

/**
 * 假设这是外部另一个系统的 user
 * @author king
 *
 */
public class OutSideUser {
	public int getMySex() {
		return 1;// 0为男 1女
	}
	
	public Date getBirthDay() {
		return new Date();
	}
	
	public String getMyName() {
		return "zhang shan";
	}
}
