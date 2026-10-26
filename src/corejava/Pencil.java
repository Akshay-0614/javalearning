//Write a Java program to calculate how many pencils a user can buy and the remaining money.

package corejava;

public class Pencil {
	
	//Stores the price of one pencil
	int Pencilcost;
	
	//Stores the amount of money available with the user
	int Usermoney;
	
	//Stores the number of pencils the user can purchase
	int usercanbuypencils;
	
	//Stores the money left after purchasing pencils
	int Userremainingamount;
	
	public static void main(String[] args) {
		
		// Create an object of the pencil class
		Pencil p1=new Pencil();
		
		//Initialize pencil price and user's available money
         p1.Pencilcost=7;
         p1.Usermoney=100;
         
         //calculate the how many pencils the user can buy
         p1.usercanbuypencils=p1.Usermoney/p1.Pencilcost;
         
         //calculate the remaining amount after purchase
         p1.Userremainingamount=p1.Usermoney%p1.Pencilcost;
         
         // display the purchase details
		System.out.println("Pencil Cost : "+p1.Pencilcost);
		System.out.println("User Money : "+p1.Usermoney);
		System.out.println("User can buy pencils with his money : "+p1.usercanbuypencils);
		System.out.println("User remaining amount after purchase : "+p1.Userremainingamount);
		

	}

}
