package com.task;

public class Count {
	static int count=0;
	static {
		System.out.println("Objects are Created ");
	}
	{
		count++;
	}
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
		  Count c=new Count();
			System.out.println("Number of objects are "+count);
		}

	}

}
