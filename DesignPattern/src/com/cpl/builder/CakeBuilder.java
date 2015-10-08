package com.cpl.builder;

import java.util.List;

public class CakeBuilder extends AbstractBuilder {
	@Override
	public SweetCake cookFood(List<Integer> recipe) {
		SweetCake cake = new SweetCake();
//		��Ӧ���������cook�ˣ�����ֻ���½�������cook����
//		���Ӧ���и������� ����ListӦ�ô���� product������� builder��
//		cake.cook(getOrder());
		cake.setOrder(recipe);
		return cake ;
	}


}
