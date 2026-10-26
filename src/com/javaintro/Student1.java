package com.javaintro;

public class Student1 {
	int studentid,studentmarks;
	String studentName;
	static String collegeName="University Arts and Science College";
	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		
		s1.studentName="D.Akshay kumar";
		s1.studentid=250010014;
		s1.studentmarks=790;
		System.out.println("College Name: "+collegeName);
		System.out.println("Student Name :"+s1.studentName);
		System.out.println("Student Id :"+ s1.studentid);
		System.out.println("Student Marks :"+s1.studentmarks);
	}

}
