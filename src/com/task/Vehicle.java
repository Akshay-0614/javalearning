//Write a Java program to create a Vehicle class using a parameterized constructor and display the vehicle details.

package com.task;

public class Vehicle {

	int vehicle_id;
	String vehicle_name;
	String vehicle_color;
	double vehicle_price;
	int vehicle_year;

	// Parameterized constructor to initialize vehicle details
	public Vehicle(int vehicleid, String vehiclename, String vehiclecolor, double vehicleprice, int vehicleyear) {

		this.vehicle_id = vehicleid;
		this.vehicle_name = vehiclename;
		this.vehicle_color = vehiclecolor;
		this.vehicle_price = vehicleprice;
		this.vehicle_year = vehicleyear;
	}

	// Method to display vehicle details
	void vehiInfo() {
		System.out.println("VEHICLE DETAILS");
		System.out.println(" ");

		System.out.println("Vehicle Id : " + vehicle_id);
		System.out.println("Vehicle Name : " + vehicle_name);
		System.out.println("Vehicle Color : " + vehicle_color);
		System.out.println("Vehicle Price : " + vehicle_price);
		System.out.println("Vehicle Year : " + vehicle_year);

	}

	public static void main(String[] args) {

		// Create an object and pass values to the parameterized constructor
		Vehicle v = new Vehicle(1919, "Thar", "Black", 1500000, 2026);

		// Call the method to display vehicle information
		v.vehiInfo();
	}

}
