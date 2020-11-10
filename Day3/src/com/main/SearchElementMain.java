package com.main;

import java.util.Arrays;

import com.service.SearchElement;

/**
 * 
 * write a Java program to search for an element of an integer array of 10
 * elements.
 * 
 * @author Lakshmi Neeharika
 */
public class SearchElementMain {

	public static void main(String[] args) {
		int[] values = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		SearchElement searchElement = new SearchElement();
		System.out.println(searchElement.search(values, 5));
	}

}
