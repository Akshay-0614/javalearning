//Write a Java program to check whether a given number is divisible by 5 or not using if-else statements and the modulo operator.

package corejava;

public class DivisibleByFive {
	int a;

	public static void main(String[] args) {
          
		//Creating an object of the DivisibleByFive class
		DivisibleByFive d = new DivisibleByFive();
		
		//Initializing the Value to the instance variable
		d.a=70;
		System.out.println("The Given Number is : "+d.a);
		System.out.println(" ");
		
		
		// Checking whether the given number is divisible by 5
		if (d.a % 5 == 0 ) {
			
			System.out.println("The Given Number is Divisible by 5 ");
		}
		
		else {
			System.out.println("The Given Number Is Not Divisible by 5 ");
		}
		

	}

}
