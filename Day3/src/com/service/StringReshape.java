package com.service;

public class StringReshape {
	public static String reshape(String value, char seperator) {
		StringBuffer data = new StringBuffer(value);
		StringBuffer result = new StringBuffer();
		data.reverse();
		data.insert(0, seperator);
		for (int i = 1; i < value.length(); i++) {
			data.insert(i + i, seperator);
		}
		return (data.substring(1, data.length())).toString();
	}
}
