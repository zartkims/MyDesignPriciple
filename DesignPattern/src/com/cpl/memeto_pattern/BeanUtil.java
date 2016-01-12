package com.cpl.memeto_pattern;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtil {
	public static Map<String, Object> createBeanMap(Object bean) {
		 Map<String, Object> map = new HashMap<String, Object>();
		 try {
			 //获取Bean描述
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			 //获取属性描述
			PropertyDescriptor [] descriptors = beanInfo.getPropertyDescriptors();
			//遍历所有属性
			for (PropertyDescriptor des : descriptors) {
				//属性名称
				String fieldName = des.getName();
				//属性读取方法
				Method getter = des.getReadMethod();
				//读取属性值
				Object fieldValue = getter.invoke(bean, new Object[]{});
				if (!fieldName.equalsIgnoreCase("class")) {
					map.put(fieldName, fieldValue);
				}
			}
		 } catch (Exception e) {
			e.printStackTrace();
		 }
		 return map;
	}
	
	public static void restoreProp(Object bean, Map<String, Object> propMap) {
			try {
				//获取Bean描述
				BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
				 //获取属性描述
				PropertyDescriptor [] descriptors = beanInfo.getPropertyDescriptors();
				//遍历所有属性
				for (PropertyDescriptor des : descriptors) {
					//属性名称
					String fieldName = des.getName();
					if (propMap.containsKey(fieldName)) { //有这个属性
						Method writeMethod = des.getWriteMethod();
						writeMethod.invoke(bean, new Object[] {propMap.get(fieldName)});
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
