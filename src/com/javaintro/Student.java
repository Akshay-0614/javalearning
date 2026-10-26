package com.javaintro;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
        
		
		System.out.println("Main Method Started:");
		System.out.println("Welcome to java world Akshay!!!!!!!!!!!");
		
		
		Class.forName("java.lang.System");
		Class.forName("java.lang.Class");
		Class.forName("com.javaintro.Employee");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Main Method Ended");
		
		
		
	}

}
