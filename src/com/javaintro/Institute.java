package com.javaintro;

public class Institute {
       static String Trainer1,Trainer2;
       String EmployeeName;
       int EmployeeId;
       String EmployeeDesignation;
	public static void main(String[] args) {
		
		Trainer1="Srikanth sir";
		Trainer2="Vishwanth Sir";
		Institute I1=new Institute();
		
		I1.EmployeeName ="D.Akshay Kumar";
		I1.EmployeeId = 1001 ;
		I1.EmployeeDesignation = "Software Developer";
		
		System.out.println("Trainer1 :"+Trainer1);
		System.out.println("Trainer2 :"+Trainer2);
		System.out.println("EmployeeName :"+I1.EmployeeName);
		System.out.println("EmployeeId :"+I1.EmployeeId);
		System.out.println("EmployeeDesignation :"+I1.EmployeeDesignation);
		// TODO Auto-generated method stub

	}

}
