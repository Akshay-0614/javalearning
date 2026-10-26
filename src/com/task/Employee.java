//Write a Java program to create an Employee object, assign employee ID, name, and salary, and display the employee details.

package com.task;

public class Employee {
	
	// Stores the unique ID of the employee
	int EmpId;
	
	// Stores the Name of the employee
	String EmpName;
	
	// Stores the salary of the employee
	Double EmpSalary;
	
	public static void main(String[] args) {

		//Creating an Object of the employee class
		Employee e = new Employee ();
		
		// Assigning employee ID to the object
		e.EmpId = 7737;
		
		// Assigning employee name to the object
		e.EmpName="Akshay";
		
		// Assigning employee salary to the object
		e.EmpSalary=50000d;
		
		// Displaying employee details
		System.out.println("Employee Details ");
		System.out.println(" ");
		
		// Displaying employee id
		System.out.println("Employee_Id : "+e.EmpId);
		
		// Displaying employee name
		System.out.println("Name of the Employee : "+e.EmpName);
		
		// Displaying employee salary
		System.out.println("Employee's Salary : "+e.EmpSalary);
	}

}
