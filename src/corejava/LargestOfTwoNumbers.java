//Write a Java program to find the largest of two numbers using if-else statements and comparison operators.

package corejava;

public class LargestOfTwoNumbers {
	
	//Instance Variable to store the values 
	int a;
	int b;

	public static void main(String[] args) {

		// Creating an object of the LargestOfTwoNumbers class
		LargestOfTwoNumbers l=new LargestOfTwoNumbers();
		
		// Initializing values for the variables
		l.a=40;
		l.b=50;
		
		System.out.println("To find the Largest Number from given two numbers ");

		System.out.println("The First Number is  : "+l.a);
		System.out.println("The Second Number is : "+l.b);
		System.out.println(" ");
		
		// Checking which number is larger using the comparison operator
		if (l.a > l.b) {
			
			System.out.println("The Largest Number is  : "+l.a);
			
		}
		else {
			
			System.out.println("The Largest Number is  : "+l.b);
			
		}
		}
	
}
