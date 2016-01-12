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
			 //��ȡBean����
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			 //��ȡ��������
			PropertyDescriptor [] descriptors = beanInfo.getPropertyDescriptors();
			//������������
			for (PropertyDescriptor des : descriptors) {
				//��������
				String fieldName = des.getName();
				//���Զ�ȡ����
				Method getter = des.getReadMethod();
				//��ȡ����ֵ
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
				//��ȡBean����
				BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
				 //��ȡ��������
				PropertyDescriptor [] descriptors = beanInfo.getPropertyDescriptors();
				//������������
				for (PropertyDescriptor des : descriptors) {
					//��������
					String fieldName = des.getName();
					if (propMap.containsKey(fieldName)) { //���������
						Method writeMethod = des.getWriteMethod();
						writeMethod.invoke(bean, new Object[] {propMap.get(fieldName)});
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
