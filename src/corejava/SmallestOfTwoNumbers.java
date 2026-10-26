package corejava;

public class SmallestOfTwoNumbers {
	
	//Instance Variables to store the values 
	int a;
	int b;


	public static void main(String[] args) {

		 // Creating an object of the SmallestOfTwoNumbers class
		SmallestOfTwoNumbers s = new SmallestOfTwoNumbers();
		
		//Initializing values to the variables
		s.a=50;
		s.b=30;
		
		System.out.println("Finding the Smallest number in given two numbers");
		System.out.println("The first Number is : "+s.a);
		System.out.println("The Second Number is : "+s.b);
		
		//checking the smallest number using the comparison operator
		if (s.a < s.b) {
			
			System.out.println("The Smallest Number is : "+s.a);
			}
		else {
			System.out.println("The Smallest Number is : "+s.b);
		}
	}
	

}
