package com.cpl.lod;
/**
 * �����Ҫ����˵�� ���Ѽ�Ҳ���о����
 * @author king
 *
 */
public class FriendHasGap {
	public static void main(String[] args) {
		new InitTheSoft2().initIt(new Wizard2());//����Ϊ�˺���
	}
}

/**
 * ���������ı�̵Ļ������Եľ�������֮��̫������
 * ���Һ����Եľ����ھ��Բ����ر��
 * @author king
 *
 */
class InitTheSoft{
	public void initIt(Wizard wizard){
		if(wizard.first())
			if(wizard.second())
				if(wizard.third())
					System.out.println("��װ���");
	}
}

class Wizard{
	public boolean first(){return true;}
	public boolean second(){return true;}
	public boolean third(){return true;}
}
/**
 * �����������Ļ����Ի����
 * @author king
 *
 */
class InitTheSoft2{
	public void initIt(Wizard2 wizard){
		wizard.init();
		if(wizard.init())System.out.println("�ɹ�");
		else System.out.println("fail");
	}
}

class Wizard2{
	private boolean first(){return true;}
	private boolean second(){return true;}
	private boolean third(){return true;}
	public boolean init(){
//		if(first())
//			if(second())
//				if(third())
//					return true;
		return first()?second()?third()?true:false:false:false;//������Ҳ�� ������ô˧
	}
}

