package corejava;

public class AddTwoNumbers {
	
	//Instance variables to store numbers
	int a;
	int b;
	
	//Variable to store the calculated sum
	int c;
	public static void main(String[] args) {
		
		//Creating an object of the AddTwoNumbers class
		AddTwoNumbers s=new AddTwoNumbers();
		
		//Assigning values to A and B
		s.a=80;
		s.b=45;
		
		//Calculating the sum of A and B
		s.c=s.a+s.b;
		
		//Displaying the result
		System.out.println("Lets print the Sum of two numbers.");
		System.out.println("The value of A = "+s.a);
		System.out.println("The value of B = "+s.b);
		System.out.println("The Sum of two Number is "+s.c);
	}

}


