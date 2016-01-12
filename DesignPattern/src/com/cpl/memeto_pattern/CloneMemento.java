package com.cpl.memeto_pattern;
/**
 * �������򵥵�clone������ʽ
 * �������ֻ�����ڼ򵥵������һЩ�漰ǳ�����������������ʹ�õĻ��ͻ�Ƚϸ���
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
		//������ģ�ⳡ��
		CloneMemento cMemen = new CloneMemento();
		cMemen.setState1("kaka");
		cMemen.setState2("tutu");
		cMemen.createMementor();//����һ������״̬
		cMemen.setState1("ssa");
		cMemen.setState2("aau");
		System.out.println(cMemen.getState1());
		cMemen.restoreMementor();//�ָ�״̬
		System.out.println(cMemen.getState1());

	}
}
