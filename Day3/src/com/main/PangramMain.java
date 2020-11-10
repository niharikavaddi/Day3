package com.main;

import java.util.Scanner;

import com.service.Pangram;

/**
 * Write a program to find the given string is pangram or not.
 * 
 * (Hint: Pangrams are words or sentences containing every letter of the
 * alphabet at least once)
 * 
 * @author Lakshmi Neeharika
 */
public class PangramMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String value = scanner.nextLine();
		Pangram pangram = new Pangram();
		System.out.println(pangram.checkPangram(value));
	}

}
