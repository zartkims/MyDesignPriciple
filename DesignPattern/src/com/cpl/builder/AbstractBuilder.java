package com.cpl.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * ���������food������
 * @author king
 *
 */
public abstract class AbstractBuilder {
//	�������listӦ�÷���product�ﾭ�����Ǻ��������Ϊ����Ļ�������ص����ظ�������ͬ������
//	private List<Integer> order = new ArrayList<Integer>();
	
	/**
	 * �������ɵõ�ʳ��
	 * @return
	 */
	public abstract AbstractFood cookFood(List<Integer> recipe);
	
	
}
