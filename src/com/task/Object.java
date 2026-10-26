package com.task;

public class Object {
	
	static int count=0;
	
	Object(){
		
		count++;
	}
	public static void main(String[] args) {
		new Object();
		new Object();
		new Object();
		new Object();
		new Object();
		System.out.println("Number of Objects are : "+count);
		

	}

}