//Swap Two Numbers Using a Third Variable

package com.task;

public class SwapTwoNumbers2 {

	public static void main(String args[]) {

		int a = 10;
		int b = 20;

		System.out.println("Before Swapping of two numbers");
		System.out.println("A =  " + a);
		System.out.println("B =  " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping of two numbers");
		System.out.println("A =  " + a);
		System.out.println("B =  " + b);

	}
}
