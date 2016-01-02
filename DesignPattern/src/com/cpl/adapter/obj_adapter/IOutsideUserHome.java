package com.cpl.adapter.obj_adapter;

/**
 * 这个和base类都是模拟多接口的情况下的场景
 * 这样模拟的意义是在于 这种设计的话 完全符合SRP原则 所以是可能回遇到的
 * @author king
 *
 */
public interface IOutsideUserHome {
	public String getHomeAddress();
	public String getPhoneNum();
	public boolean isMerry();
	public String getFamliyBackground();
}
