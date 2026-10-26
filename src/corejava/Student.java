//Create a `Student` class with a constructor and create its object in `main()` to call the constructor.

package com.fundamentals;

public class Student {

	// No-argument constructor
	Student() {

		// Prints a message when the constructor is called
		System.out.println("Constucter is called.");
	}

	public static void main(String[] args) {

		// Creating an object of the Student class
		// The constructor is automatically called
		Student s = new Student();
	}

}
