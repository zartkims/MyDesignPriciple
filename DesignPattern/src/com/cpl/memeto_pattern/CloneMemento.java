package com.cpl.memeto_pattern;
/**
 * 这个是最简单的clone备忘方式
 * 但是这个只适用于简单的情况，一些涉及浅拷贝和深拷贝的情况如果使用的话就会比较复杂
 * @author king
 *
 */
public class CloneMemento implements Cloneable{
	private String state1 = "";
	private String state2 = "";
	private CloneMemento memo ;
	public String getState1() {
		return state1;
	}
	public void setState1(String state1) {
		this.state1 = state1;
	}
	public String getState2() {
		return state2;
	}
	public void setState2(String state2) {
		this.state2 = state2;
	}
	public void createMementor() {
			memo = this.clone();
	}
	
	public void restoreMementor() {
		this.state1 = this.memo.state1;
		this.state2 = this.memo.state2;
	}
	
	@Override
	protected CloneMemento clone() {
		try {
			return (CloneMemento) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		//现在是模拟场景
		CloneMemento cMemen = new CloneMemento();
		cMemen.setState1("kaka");
		cMemen.setState2("tutu");
		cMemen.createMementor();//创建一个备忘状态
		cMemen.setState1("ssa");
		cMemen.setState2("aau");
		System.out.println(cMemen.getState1());
		cMemen.restoreMementor();//恢复状态
		System.out.println(cMemen.getState1());

	}
}
