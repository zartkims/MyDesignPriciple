package com.cpl.builder;
/**
 * �����յ���
 * @author king
 *
 */
public class SweetCake extends AbstractFood {

	@Override
	protected void addSalt() {
		System.out.println("�𵰸�ΪɶҪ����~");
	}

	@Override
	protected void addSuger() {
		System.out.println("������");
	}

	@Override
	protected void addWater() {
		System.out.println("ˮ����Ҫ��");
	}

	@Override
	protected void addMuilk() {
		System.out.println("ţ��ҲҪ����");
	}

	@Override
	protected void addOil() {
		System.out.println("���͵Ļ�Ҳ�ǿ��Էŵģ�����Ҳ����");
	}

}
