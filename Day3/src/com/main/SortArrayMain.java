package com.main;

import java.util.Arrays;

import com.service.SortArray;

/**
 * write a Java program to sort an integer array of 10 elements in ascending.
 * 
 * @author Lakshmi Neeharika
 */
public class SortArrayMain {

	public static void main(String[] args) {
		int[] values = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		SortArray sortArray = new SortArray();
		System.out.println(Arrays.toString(sortArray.sort(values)));
	}

}
