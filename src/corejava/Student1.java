// Create a Java class Student and count how many objects are created without using an instance block.

package com.fundamentals;

public class Student1 {
	
	
	// Static variable shared by all Student1 objects
	static int count;
	
	
	 // Constructor is called automatically whenever an object is created
	Student1(){
		
			System.out.println("No-Arg constructers called");
		
			// Increase the object count by 1
			count++;
	}

	void main() {
		
		// Creating the first Student1 object
		Student1 s1=new Student1();
		
		// Creating the Second Student1 object
		Student1 s2=new Student1();
		
		// Creating the third Student1 object
		Student1 s3=new Student1();
		
        // Display the total number of objects created
			System.out.println("Number of Objects : "+count);

	}

}
