package com.cpl.specification;

/**
 * ����Ļ����ǹ̶�����ȻΥ�����������ã������������Ǻ�ȷ����ϵ�� ���� ���� �Ҳ���ı����Բ�����˷��ĵ�Υ����������
 * ��������������Ҳд������,Ϊ����߷�װ
 * @author caipengli
 * @param <T>
 *
 */
public abstract class CompsingSpecification<T> implements ISpecification<T> {

	@Override
	public ISpecification and(ISpecification specification) {
		return new AndSpecification(this, specification);
	}

	@Override
	public ISpecification or(ISpecification specification) {
		return new OrSpecification(this, specification);
	}

	@Override
	public ISpecification not() {
		return new NotSpecification(this);
	}

	public abstract boolean isSatisfiedBy(T t);
	
	private final class AndSpecification extends CompsingSpecification {
		ISpecification left;
		ISpecification right;
		public AndSpecification(ISpecification left, ISpecification right) {
			this.left = left;
			this.right = right;
		}
		@Override
		public boolean isSatisfiedBy(Object ob) {
			return left.isSatisfiedBy(ob) && right.isSatisfiedBy(ob);
		}
	}
	
	private final class OrSpecification extends CompsingSpecification {
		ISpecification left;
		ISpecification right;
		public OrSpecification(ISpecification left, ISpecification right) {
			this.left = left;
			this.right = right;
		}
		@Override
		public boolean isSatisfiedBy(Object ob) {
			return left.isSatisfiedBy(ob) || right.isSatisfiedBy(ob);
		}
	}
	
	private final class NotSpecification extends CompsingSpecification {
		ISpecification left;
		public NotSpecification(ISpecification sp) {
			this.left = sp;
		}
		@Override
		public boolean isSatisfiedBy(Object ob) {
			return !left.isSatisfiedBy(ob);
		}
	}
}
