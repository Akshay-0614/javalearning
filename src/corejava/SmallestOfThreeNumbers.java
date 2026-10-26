//Write a Java program to find the smallest among three numbers using if-else statements and comparison operators.

package corejava;

public class SmallestOfThreeNumbers {
	
	//Instance variables to store the values
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		
		// Creating an object of the SmallestOfThreeNumbers class
		SmallestOfThreeNumbers s = new SmallestOfThreeNumbers();
		
		//Initializing values to the variables 
		s.a=80;
		s.b=100;
		s.c=30;
		
		System.out.println("Finding the Smallest Number among Three Numbers ");
		System.out.println(" ");
		
        // Checking which number is the smallest using comparison operators
		if (s.a <= s.b && s.a <= s.c) {
			System.out.println("The Smallest of Three Numbers is : "+s.a);
		}
		
		else if (s.b <= s.a && s.b <= s.c ){
			System.out.println("The Smallest of Three Numbers is : "+s.b);
		}
		else{
			System.out.println("The Smallest of Three Numbers is : "+s.c);
		
		}
	}

}

