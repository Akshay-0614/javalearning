package corejava;

public class LeapYear {
	
	int a;

	public static void main(String[] args) {
			
			//Creating an object of the LeapYear class
			LeapYear l=new LeapYear();
			
			// Initializing the value to the instance variable
			l.a = 2027;
			
		System.out.println("Checking Whether the Year is a Leap Year or Not");
		System.out.println(" ");
		
		 // Checking the leap year condition using the modulo operator and logical operators
		if(l.a % 400 == 0 || (l.a % 4 == 0 && l.a % 100 != 0) ) {
			
			System.out.println("The Given Year is a Leap Year : "+l.a);
		}
	
		else {
			System.out.println("The Given Year is not a Leap Year : "+l.a);
		}
	
	}

}
