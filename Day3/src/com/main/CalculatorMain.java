package com.main;

import com.service.Calculator;

/**
 * I have created a class Calculator inside a package name com.hcl package
 * com.hcl;
 * 
 * public class Calculator {
 * 
 * public int add(int a, int b){
 * 
 * return a+b;
 * 
 * }
 * 
 * }
 * 
 * how to use add method from another package.
 * 
 * @author Lakshmi Neeharika
 */
public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(2, 3));
	}

}
