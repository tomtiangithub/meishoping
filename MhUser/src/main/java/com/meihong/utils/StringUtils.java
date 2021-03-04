package com.meihong.utils;

/**
 * �ַ���������
 * @author tch
 * @date Sep 1, 2021
 */
public class StringUtils {

	/**
	 * �пղ���
	 * @param value
	 * @return
	 */
	public static boolean isBlank(String value) {
		return value == null || "".equals(value) || "null".equals(value) || "undefined".equals(value);
	}

}