package com.main;

import java.util.Scanner;

import com.service.Palindrome;

/**
 * 
 * Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise.
 * 
 * @author Lakshmi Neeharika
 */
public class PalindromeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word:");
		String data = scanner.next();
		Palindrome palindrome = new Palindrome();
		System.out.println((palindrome.validate(data)));
	}
}
