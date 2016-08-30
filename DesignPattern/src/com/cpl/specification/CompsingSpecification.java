package com.cpl.specification;

/**
 * 这个的话就是固定，虽然违反了依赖倒置，但是由于我们很确定关系就 与或非 三种 且不会改变所以才能如此放心的违反依赖倒置
 * 而且这三个倒置也写在这了,为了提高封装
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
