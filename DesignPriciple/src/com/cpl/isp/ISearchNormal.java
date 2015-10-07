package com.cpl.isp;

import java.util.Map;

/**
 * 这个可以当做的是提供给外界的简单查询 
 * @author king
 *
 */
public interface ISearchNormal {
	public IBook findByName(String name);
	public IBook findById(String id);
	public IBook findByAuthor(String author);
	//
	//下面这个方法如果按照SRP放在这个里也没问题，但是按照isp就应该独立分出去
//	public IBook find(Map<String, String> condition);
}
