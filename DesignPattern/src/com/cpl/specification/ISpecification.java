package com.cpl.specification;

public interface ISpecification<T> {
	public ISpecification and(ISpecification specification);
	public ISpecification or(ISpecification specification);
	public ISpecification not();
	
	/**
	 * 如果是确定某个种类的规格过滤的话，这里可以写具体的种类
	 * 不过此处我把它放到子类中自己维护
	 * @param ob
	 * @return
	 */
	public boolean isSatisfiedBy(T ob);
}
