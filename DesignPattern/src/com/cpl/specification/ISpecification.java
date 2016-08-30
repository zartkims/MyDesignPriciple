package com.cpl.specification;

public interface ISpecification<T> {
	public ISpecification and(ISpecification specification);
	public ISpecification or(ISpecification specification);
	public ISpecification not();
	
	/**
	 * �����ȷ��ĳ������Ĺ����˵Ļ����������д���������
	 * �����˴��Ұ����ŵ��������Լ�ά��
	 * @param ob
	 * @return
	 */
	public boolean isSatisfiedBy(T ob);
}
