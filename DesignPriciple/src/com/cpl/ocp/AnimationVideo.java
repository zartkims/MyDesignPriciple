package com.cpl.ocp;

/**
 * ���ڼ���Ҫʵ�д��۵Ĳ���
 * ��ô�Ա仯���޸��м��ֲ���
 * 1.�޸�IVideo�ӿ�,������Ȼ
 * 2.�޸ı����getPrice����,������� ���� �����������ܻᵼ��һЩ�����ϻ������������˵����⣨�����ӱȽϼ�����û���⣩
 * 3.�̳б����������޸ģ��������OCPԭ��
 * @author king
 *
 */
public class AnimationVideo implements IVideo{
	private String name;
	private String author;
	private int price;
	
	public AnimationVideo(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public int getPrice() {
//		return (int) (price>4000?price*0.8:price*0.9);//�����Ļ�����ֱ���޸ı�������Ӧ�仯
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAuthor() {
		return author;
	}

}
