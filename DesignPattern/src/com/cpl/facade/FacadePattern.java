package com.cpl.facade;

public class FacadePattern {
	private A a = new A();
	private B b= new B();
	private C c = new C();
	private MyContext d = new MyContext();
	public void methodA() {
		a.doSomething();
	}
	
	public void methodB() {
		b.doSomething();
	}
	
	public void methodC() {
		c.doSomething();
	}
	
	public void methodD() {
//		��������ֱ�ӵ����ǲ��Եģ�
//		��Ϊ����ģʽ��Ӧ�ò����κε��߼�ֻ�Ǹ�ί���࣬��������߼��ͻᵼ�����������ش���
//		a.doSomething();
//		c.doSomething();
//		��ȷ����������
		d.doSomething();
	}
}

class A {
	public void doSomething() {}
}
class B {
	public void doSomething() {}
}
class C {
	private A a = new A();
	private B b= new B();
	public void doSomething() {}
}

class MyContext {
	private A a = new A();
	private C c= new C();
	public void doSomething() {
		a.doSomething();
		c.doSomething();
	}
}