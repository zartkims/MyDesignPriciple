package com.cpl.memeto_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * �����Ϊ����¼�Ĺ�����
 * @author king
 *
 */
public class CareTaker {
	private Map<String, IMemento> mementors = new HashMap<String, IMemento>();
	public void addMemento(String key, IMemento memento) {
		mementors.put(key, memento);
	}
	
	public IMemento getMemento(String key) {
		return mementors.get(key);
	}
}
