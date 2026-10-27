//1.write a Java program to swap two numbers without using third variable ?
package com.task;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Before Swapping two numbers
		System.out.println("Before Swapping of two Numbers");
		System.out.println("A = " + a);
		System.out.println("B = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		// After Swapping of two numbers
		System.out.println("After Swapping of Two Numbers");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

}
