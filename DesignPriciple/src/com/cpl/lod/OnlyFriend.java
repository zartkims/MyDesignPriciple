package com.cpl.lod;

import java.util.ArrayList;
import java.util.List;

public class OnlyFriend {

}

/**
 * ����������д�Ļ���û��Ū�� ֮������˵����ԭ�� 
 * ��Ϊ��ʦ��������Gril�࣬��Ͳ��Ǻܺ���
 * ���õ�Ӧ����������������
 * @author king
 *
 */
class Teacher{
	public void sortTheGrils(ClassLeader leader){
		List<Gril> grils = new ArrayList<Gril>();
		for(int i=0;i<20;i++){grils.add(new Gril());}
		leader.sort(grils);
	}
}
class ClassLeader{
	public void sort(List<Gril> grils){System.out.println("����źö�");}
}
class Gril{}

/**
 * �����Ļ��ͱȽϺ�����ʦû��ֱ�Ӻ�Gril�򽻵� ֻ������leader�򽻵�
 * @author king
 *
 */
class Teacher2{
	public void sortTheGrils(ClassLeader2 leader){
		leader.sort();
	}
}
class ClassLeader2{
	public void sort(){
		List<Gril> grils = new ArrayList<Gril>();
		for(int i=0;i<20;i++){grils.add(new Gril());
	}
		System.out.println("����źö�");}
}