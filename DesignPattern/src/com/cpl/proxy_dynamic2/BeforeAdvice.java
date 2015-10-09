package com.cpl.proxy_dynamic2;

public class BeforeAdvice implements IAdvice{
	@Override
	public void exec() {
		System.out.println("执行了前置通知");
	}

}
