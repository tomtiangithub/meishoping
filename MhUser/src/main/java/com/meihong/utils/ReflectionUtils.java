package com.meihong.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ������ظ�������
 * @author tch
 * @date Aug 19, 2021
 */
public class ReflectionUtils {

	
	/**
	 * ���ݷ���������ָ������ķ���
	 * @param object Ҫ���÷����Ķ���
	 * @param method Ҫ���õķ�����
	 * @param args ������������
	 * @return
	 */
	public static Object invoke(Object object, String method, Object... args) {
		Object result = null;
		Class<? extends Object> clazz = object.getClass();
		Method queryMethod = getMethod(clazz, method, args);
		if(queryMethod != null) {
			try {
				result = queryMethod.invoke(object, args);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} else {
			try {
				throw new NoSuchMethodException(clazz.getName() + " ����û���ҵ� " + method + " ������");
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * ���ݷ������Ͳ���������ҷ���
	 * @param clazz
	 * @param name
	 * @param args ����ʵ������
	 * @return
	 */
	public static Method getMethod(Class<? extends Object> clazz, String name, Object[] args) {
		Method queryMethod = null;
		Method[] methods = clazz.getMethods();
		for(Method method:methods) {
			if(method.getName().equals(name)) {
				Class<?>[] parameterTypes = method.getParameterTypes();
				if(parameterTypes.length == args.length) {
					boolean isSameMethod = true;
					for(int i=0; i<parameterTypes.length; i++) {
						Object arg = args[i];
						if(arg == null) {
							arg = "";
						}
						if(!parameterTypes[i].equals(args[i].getClass())) {
							isSameMethod = false;
						}
					}
					if(isSameMethod) {
						queryMethod = method;
						break ;
					}
				}
			}
		}
		return queryMethod;
	}
}