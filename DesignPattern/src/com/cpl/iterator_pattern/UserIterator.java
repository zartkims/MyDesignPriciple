package com.cpl.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * ������ģʽ�Ѿ������ںϵ��� JDK��������ֱ����jdk�� ��Ҫ�Լ�д��
 * ��Ҫ�ظ���������
 * @author king
 *
 */
public class UserIterator implements Iterable<IUser> {
	List<IUser> users = new ArrayList<IUser>();
	@Override
	public Iterator<IUser> iterator() {
		return users.iterator();
	}
	
	public static void main(String []args){
		for(IUser us : new UserIterator()){}
		
	}
	
}
//�����ȫ���־����Լ������Կ� û����̫��ϸ��
class School implements Iterator<IUser> {
	int size = 50;
	int index = 0;
	IUser[] users = new User [size];
	@Override
	public boolean hasNext() {
		if(index < 50 && users[index] != null) return true;
		return false;
	}

	@Override
	public IUser next() {
		if(hasNext()) return this.users[index++];
		return null;
	}

	@Override
	public void remove() {
		//���鷳�� ���Ƶ� �ƶ�copy����
		int numMoved = size - index - 1;
		if (numMoved > 0) {
			System.arraycopy(users, index+1, users, index,numMoved);
		}
		users[--size] = null; // Let gc do its work
	}
	
}