package com.cpl.factory_easy;
/**
 * д����ി���Ǿ��úú���Ͼ���������
 * @author king
 *
 */
public class ConcreteHumanFactory extends AbstarctHumanFactory{

	@Override
	public <T extends IHuman> T createHuman(Class<T> c) {
		IHuman human = null;
		try {
			human = (T) Class.forName(c.getName()).newInstance();//���ȷʵ����
		} catch (Exception/*InstantiationException | IllegalAccessException | ClassNotFoundException*/ e) {
			e.printStackTrace();
		}
		return (T) human;
	}

	public static void main(String[] args) {
		AbstarctHumanFactory me = new ConcreteHumanFactory();
		me.createHuman(WhiteHuman.class).say();
		me.createHuman(YellowHuman.class).say();
		me.createHuman(BlackHuman.class).say();
	}
}
