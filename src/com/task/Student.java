package com.task;

public class Student {
	
	String Name;
	int Age;
	String College;
	String Department;

	public static void main(String[] args) {
		Student S1 = new Student();
		S1.Name="Akshay kumar";
		S1.Age=23;
		S1.Department="MCA";
		S1.College="University Arts and Science";
		System.out.println("Student Details in MCA ");
		System.out.println(" ");
		System.out.println("Name of the Student : "+S1.Name);
		System.out.println("Age of the Student  : "+S1.Age);
		System.out.println("Name of the College :"+S1.College);
		System.out.println(" ");

		Student S2= new Student();
		S2.Name="Ajay";
		S2.Age=23;
		S2.Department="MCA";
		S2.College="University Arts and Science";
		System.out.println("Name of the Student : "+S2.Name);
		System.out.println("Age of the Student  : "+S2.Age);
		System.out.println("Name of the College :"+S2.College);
		System.out.println(" ");

		Student S3= new Student();

		S3.Name="Shannu";
		S3.Age=25;
		S3.Department="MCA";
		S3.College="University Arts and Science";
		
		System.out.println("Name of the Student : "+S3.Name);
		System.out.println("Age of the Student  : "+S3.Age);
		System.out.println("Name of the College :"+S3.College);
		System.out.println(" ");

		Student S4= new Student();

		S4.Name="Naveen";
		S4.Age=23;
		S4.Department="MCA";
		S4.College="University Arts and Science";
		System.out.println("Name of the Student : "+S4.Name);
		System.out.println("Age of the Student  : "+S4.Age);
		System.out.println("Name of the College :"+S4.College);
		System.out.println(" ");
		
		Student S5= new Student();
		
		S5.Name="Vilas";
		S5.Age=23;
		S5.Department="MCA";
		S5.College="University Arts and Science";
		System.out.println("Name of the Student : "+S5.Name);
		System.out.println("Age of the Student  s: "+S5.Age);
		System.out.println("Name of the College :"+S5.College);

	
	}

}
