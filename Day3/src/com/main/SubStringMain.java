package com.main;

import com.service.SubString;

/**
 * Accept a string, and two indices(integers), and print the substring
 * consisting of all characters inclusive range from ..to .
 * 
 * @author Lakshmi Neeharika
 */
public class SubStringMain {

	public static void main(String[] args) {
		String value = "I play cricket";
		SubString subString = new SubString();
		System.out.println(subString.sendString(2, 8, value));
	}

}
