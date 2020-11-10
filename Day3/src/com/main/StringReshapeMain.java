package com.main;

import java.util.Scanner;
import com.service.StringReshape;

/**
 ** Write a program to read a string and a character, and reverse the string and
 * convert it in a format such that each character is separated by the given
 * character. Print the final string.
 * 
 * @author Lakshmi Neeharika
 */
public class StringReshapeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word:");
		String value = scanner.next();
		System.out.println("Enter seperator");
		char seperator = scanner.next().charAt(0);
		System.out.println(StringReshape.reshape(value, seperator));

	}

}
