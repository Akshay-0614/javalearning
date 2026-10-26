//Write a Java program to create a Mobile class using a parameterized constructor and display the mobile details.

package com.task;

public class Mobile {

	int Mobile_id;
	String Mobile_name;
	String Mobile_color;
	double Mobile_price;
	int Mobile_year;

	// Parameterized constructor to initialize mobile details
	public Mobile(int mobileid, String mobilename, String mobilecolor, double mobileprice, int mobileyear) {

		this.Mobile_id = mobileid;
		this.Mobile_name = mobilename;
		this.Mobile_color = mobilecolor;
		this.Mobile_price = mobileprice;
		this.Mobile_year = mobileyear;
	}

	// Method to display mobile details
	void mobiInfo() {
		System.out.println("MOBILE DETAILS");
		System.out.println(" ");

		System.out.println("Mobile Id : " + Mobile_id);
		System.out.println("Mobile Name : " + Mobile_name);
		System.out.println("Mobile Color : " + Mobile_color);
		System.out.println("Mobile Price : " + Mobile_price);
		System.out.println("Mobile Year : " + Mobile_year);

	}

	public static void main(String[] args) {

		// Create an object and pass values to the parameterized constructor
		Mobile m = new Mobile(4232, "Readme", "Black", 15000, 2026);

		// Call the method to display mobile information
		m.mobiInfo();
	}

}
