//Create an Employee class with employee details. Use constructors to initialize employee data and display the
//details of multiple employees using a method.

package com.fundamentals;

public class Employee {
	
	int eid;
	String ename;
	double esal;
	
	// No-argument constructor
	Employee (){
		System.out.println("No-Args called");
	}
	
	// Parameterized constructor to initialize employee details
	Employee (int id,String nm,double sal){
		
		this.eid=id;
		this.ename=nm;
		this.esal=sal;
		
	}
	
	
	// Method to display employee details
	void empinfo() {
		
		System.out.println("Id of the Employee : "+eid);
		System.out.println("Name of the Employee : "+ename);
		System.out.println("Salary of the Employee : "+esal);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Main method Started");
		System.out.println(" ");
		
		// Creating the first Employee object using parameterized constructor
		Employee e1=new Employee (1,"Akshay",50000);
		e1.empinfo();
		
		System.out.println(" ");
		
		// Creating the second Employee object
		Employee e2=new Employee (2,"Ashfaq",60000);
		e2.empinfo();
		
		System.out.println(" ");
		
		// Creating the Third Employee object
		Employee e3=new Employee (3,"Mahesh",90000);
		e3.empinfo();
		
		System.out.println(" ");
		System.out.println("Main method Ended");

	}

}
