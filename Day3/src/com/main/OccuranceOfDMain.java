package com.main;

import java.util.Scanner;

import com.service.OccuranceOfD;

/**
 * Write a Java program to replace all the 'd' occurrence characters with ‘h’
 * characters in each string.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class OccuranceOfDMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String value = scanner.next();
		OccuranceOfD occuranceOfD = new OccuranceOfD();
		System.out.println(occuranceOfD.convert(value));
	}

}
