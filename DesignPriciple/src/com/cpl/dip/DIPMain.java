package com.cpl.dip;

/**
 * ���Բο��²���ģʽ������׸��
 * @author king
 *
 */
public class DIPMain {
	public static void main(String[] args) {
		IDriver driver = new ConcreteDriver();
		driver.drive(new BMW());//���ʹ�õĽӿ�ע��ķ�ʽ
		//��������ע�뷽ʽ�� ������ע�� �� setterע��
		//ʹ��setterע��Ļ�������ȫ�Ĳ���ģʽ�� �����Ҽ��ϰ�
		driver.setCar(new Benze());
		driver.drive();
	}
}
