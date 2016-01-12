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
//		下面这样直接调用是不对的，
//		因为门面模式不应该参与任何的逻辑只是个委托类，如果参与逻辑就会导致依赖的严重错误
//		a.doSomething();
//		c.doSomething();
//		正确的做法如下
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