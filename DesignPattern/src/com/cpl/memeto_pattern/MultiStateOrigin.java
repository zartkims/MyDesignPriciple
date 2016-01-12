package com.cpl.memeto_pattern;

import java.util.Map;

public class MultiStateOrigin {
	private String name = "man";
	private int age = 20;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public IMemento createMementor() {
		return new MultiMementor(BeanUtil.createBeanMap(this));
	}
	
	public void restoreMementor(IMemento memento) {
		BeanUtil.restoreProp(this, ((MultiMementor)memento).getMap());
	}
	
	private class MultiMementor implements IMemento {
		private Map<String, Object> map;

		public MultiMementor(Map<String, Object> map) {
			setMap(map);//hha 这里就是为了木有warning
		}

		public Map<String, Object> getMap() {
			return map;
		}

		public void setMap(Map<String, Object> map) {
			this.map = map;
		}
	}
	
	@Override
	public String toString() {
		return name + "_" + age;
	}
}
