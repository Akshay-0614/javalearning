//Write a Java program to check whether a given number is positive, negative, or zero using if-else-if-else statements and comparison operators.

package corejava;

public class PositiveNegativeOrZero {
	
	//Instance variables to store the values
	int a;

	public static void main(String[] args) {
		
		// Creating an object of the PositiveNegativeOrZero class
		PositiveNegativeOrZero p = new PositiveNegativeOrZero();
		
		//Initializing values to the variables 
		p.a=-50;
		
		System.out.println("Checking Whether the Number is Positive, Negative, or Zero");
		System.out.println(" ");
		
        // Checking whether the number is positive, negative, or zero using comparison operators
		if (p.a > 0) {
			System.out.println("The Number is Positive : "+p.a);
		}
		
		else if (p.a < 0){
			System.out.println("The Number is Negative : "+p.a);
		}
		else{
			System.out.println("The Number is Zero : "+p.a);
		
		}
	}

}


