//Write a Java program using methods to perform addition, subtraction, multiplication, and division.

package com.task;

public class MethodTask {
	
	public static void main(String[] args) {
		
		// Displaying the title of the program
		System.out.println("A program on Methods");
		
		Rose(20,30);
	}

	//Method-1: Performs addition of two numbers
   	static void Rose(int a ,int b) {
		System.out.println(" ");
		
		// Adding two numbers and storing the result in c
		int c=a+b; 
		
	  System.out.println("Method-1 Operaton is Sum Of Two Numbers : " + c);
	// Calling the Lilly() method and passing the addition result
	  Lilly(c,10);
	}

	//Method-2: Performs subtraction of two numbers
	static void Lilly(int c,int d) {
		System.out.println(" ");
		
		// Subtracting d from c and storing the result in e
		int e=c-d;
		
		System.out.println("Method-2 Operation is Subtraction of Two Numbers : "+e);
		// Calling the Lotus() method and passing the subtraction result
		Lotus(e,30);
	}
	
	//Method-3: Performs multiplication of two numbers
	static void Lotus(int e,int f) {
		System.out.println(" ");
		
		// Multiplying two numbers and storing the result in g
		int g =e*f;
		
		System.out.println("Method-3 Opeation is Multiplication of Two Numbers : "+g);
		// Calling the Jasmine() method and passing the multiplication result
		Jasmine(g,20);
	
	}
	
	// Method-4: Performs division of two numbers
	static void Jasmine(int g,int h) {
		System.out.println(" ");
		
		// Division of two numbers and storing the result in i
		int i =g/h;
		
		System.out.println("Method-4 Operation is Division of Two Numbers : "+i);
	}
}
