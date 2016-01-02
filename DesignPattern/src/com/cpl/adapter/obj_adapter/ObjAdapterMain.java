package com.cpl.adapter.obj_adapter;

public class ObjAdapterMain {
	public static void main(String[] args) {
		IOutsideUserBase base = null;//从其他地方获得
		IOutsideUserHome home = null;//从其他地方获得
		IUserInfo userInfo = new OutsideUserAdapter(base, home);//这样就能直接用在自己的系统中了
	}
}
