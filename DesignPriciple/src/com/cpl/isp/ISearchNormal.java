package com.cpl.isp;

import java.util.Map;

/**
 * ������Ե��������ṩ�����ļ򵥲�ѯ 
 * @author king
 *
 */
public interface ISearchNormal {
	public IBook findByName(String name);
	public IBook findById(String id);
	public IBook findByAuthor(String author);
	//
	//������������������SRP���������Ҳû���⣬���ǰ���isp��Ӧ�ö����ֳ�ȥ
//	public IBook find(Map<String, String> condition);
}
