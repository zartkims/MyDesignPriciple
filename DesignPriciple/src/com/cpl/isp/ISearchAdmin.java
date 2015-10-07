package com.cpl.isp;

import java.util.Map;

public interface ISearchAdmin {
	//模仿的是复杂度查询
	public IBook find(Map<String, String> condition);
}
