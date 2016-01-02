package com.cpl.stratege;

public class StrategyMain {
	public static void main(String[] args) {
		System.out.println(StrategyCalculator.ADD.exec(1, 2));
		System.out.println(StrategyCalculator.ADD.exec(5, 2));
	}
}
