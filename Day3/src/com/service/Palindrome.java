package com.service;

public class Palindrome {
	public String validate(String value) {
		StringBuffer data = new StringBuffer(value);
		data.reverse();
		String data1 = data.toString();
		if (value.equals(data1))
			return "Yes";
		else
			return "No";
	}
}
