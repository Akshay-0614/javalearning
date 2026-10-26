//Write a Java program to find the largest among three numbers using if-else statements and comparison operators.

package corejava;

public class LargestOfThreeNumbers {
	
	//Instance variables to store the values
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		
		//Creating object of the LargestOfThreeNumbers class
		LargestOfThreeNumbers l = new LargestOfThreeNumbers();
		
		//Initializing values to the variables 
		l.a=60;
		l.b=70;
		l.c=90;
		
		System.out.println("Finding the Largest number from three numbers ");
		System.out.println(" ");
		
        // Checking which number is the largest using comparison operators
		if (l.a >= l.b && l.a >= l.c) {
			System.out.println("The Largest of three numbers is : "+l.a);
		}
		
		else if (l.b>= l.a && l.b >= l.c ){
			System.out.println("The Largest of three numbers is : "+l.b);
		}
		else{
			System.out.println("The Largest of three numbers is : "+l.c);
		
		}
	}

}
