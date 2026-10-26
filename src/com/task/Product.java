//Write a Java program to create a Product object using a parameterized constructor and 
//create a copy of the product using a copy constructor.
//Calculate the total price based on quantity.

package com.task;

//This program demonstrates the use of a parameterized constructor and copy constructor.
public class Product {

	int productid;
	String productname;
	double price;
	int quantity;

	// Parameterized constructor to initialize product details
	public Product(int productid, String productname, double price, int quantity) {

		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;

	}

	// Copy constructor to copy product details from another object
	public Product(Product b) {

		this.productid = b.productid;
		this.productname = b.productname;
		this.price = b.price;
		this.quantity = b.quantity;
	}

	// Method to calculate and display the total product price
	void calculateTotal() {
		System.out.println("Product Details");
		System.out.println("");
		System.out.println("Product Id : " + productid);
		System.out.println("Product Name : " + productname);
		System.out.println("Product Price : " + price * quantity);
		System.out.println("Product Quantity : " + quantity);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		// Create the original product object using a parameterized constructor
		Product a = new Product(1001, "Cricket kit", 15000, 2);
		
		// Display the original product details
		a.calculateTotal();

		// Create a copy of the original product using a copy constructor
		Product b = new Product(a);
		
		// Change the quantity of the copied product
		b.quantity = 3;
		
		// Display the copied product details
		b.calculateTotal();

	}

}
