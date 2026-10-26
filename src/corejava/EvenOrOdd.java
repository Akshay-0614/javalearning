//Write a Java program to check whether a given number is even or odd using if-else statements.

package corejava;

public class EvenOrOdd {
	
	//Instance variable to store value
	int a;

	public static void main(String[] args) {
		
		System.out.println("Check the given Number is Even or Odd ");
		System.out.println(" ");

		
		//creating an object of the EvenOrOdd class
		EvenOrOdd e= new EvenOrOdd();
		e.a=20;
		
		//Checking the given number is even or odd
		//If the Given number is even,the if block will execute
		
		if (e.a % 2 == 0) { //checking the number with condition
			
			System.out.println("The given number is Even : "+e.a);
		
			}
		//If the given number is odd, the else block will execute
		else{
			System.out.println("The given Number is Odd : "+e.a);
		}
		
	}

}
