package com.service;

public class StringModify {
	public static String getString(String value) {
		StringBuffer result = new StringBuffer();
		if (value.charAt(0) != 'k' && value.charAt(1) != 'b') {
			return (value.substring(2, value.length())).toString();
		} else if (value.charAt(0) == 'k') {
			return (result.append('k').append(value.substring(2, value.length()))).toString();
		} else if (value.charAt(1) == 'b') {
			return (result.append('b').append(value.substring(2, value.length()))).toString();
		} else
			return null;
	}
}