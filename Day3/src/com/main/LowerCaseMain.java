package com.main;

import java.util.Scanner;

import com.service.LowerCase;

/**
 * Write a Java program to convert all the characters in a string to lowercase.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class LowerCaseMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String value = scanner.next();
		LowerCase lowerCase = new LowerCase();
		System.out.println(lowerCase.convert(value));
	}

}
