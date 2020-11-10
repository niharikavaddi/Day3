package com.main;

import java.util.Scanner;

import com.service.StringModify;

/**
 * Write a program to read a string and return a modified string based on the
 * following rules. Return the String without the first 2 characters except when
 * Keep the first char if it is 'k' Keep the second char if it is 'b'. Create a
 * class UserMainCode with a static method getString which accepts a string and
 * the return type (string) should be the modified string based on the above
 * rules. Consider all letters in the input to be small case.
 * 
 * @author Lakshmi Neeharika
 */
public class StringModifyMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = scanner.next();
		System.out.println(StringModify.getString(value));
	}

}
