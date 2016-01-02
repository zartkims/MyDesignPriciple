package com.cpl.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 迭代器模式已经自行融合到了 JDK里面所以直接用jdk的 不要自己写！
 * 不要重复发明轮子
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
//这个完全娱乐就是自己想试试看 没在意太多细节
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
		//蛮麻烦的 估计得 移动copy数组
		int numMoved = size - index - 1;
		if (numMoved > 0) {
			System.arraycopy(users, index+1, users, index,numMoved);
		}
		users[--size] = null; // Let gc do its work
	}
	
}