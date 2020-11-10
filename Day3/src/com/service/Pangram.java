package com.service;

public class Pangram {
	public String checkPangram(String value) {
		int count = 0;
		for (char a = 'a', b = 'A'; a <= 'z' && b <= 'Z'; a++, b++) {
			for (int i = 0; i < value.length(); i++) {
				if (value.charAt(i) == a || value.charAt(i) == b) {
					count++;
					break;
				}
			}
		}
		if (count == 26)
			return "Panagram";
		else
			return "Not Panagram";
	}
}
