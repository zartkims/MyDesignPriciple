package com.cpl.adapter.obj_adapter;

public class ObjAdapterMain {
	public static void main(String[] args) {
		IOutsideUserBase base = null;//�������ط����
		IOutsideUserHome home = null;//�������ط����
		IUserInfo userInfo = new OutsideUserAdapter(base, home);//��������ֱ�������Լ���ϵͳ����
	}
}
