package com.cpl.stratege;

public enum StrategyCalculator {
	ADD{
		public int exec(int a,int b) {
			return a + b;
		}
	},
	SUB{
		public int exec(int a,int b) {
			return a - b;
		}
	};
	public abstract int exec(int a, int b);
}
