package com.task;

import java.time.LocalDate;

public class Movie {
 
	static String TheatreName="DAK Cinemas";
	 static String TheatreLocation = "Hyderabad";
	 
	    String MovieName;
		long MovieBudget;
	    LocalDate MovieReleaseDate;

	public static void main(String[] args) {
	
	        Movie a=new Movie();
	        
	        a.MovieName = "Sri Anjaneyam";
	        a.MovieBudget= 55000000;
	        a.MovieReleaseDate=LocalDate.of(2026, 6, 14);
	       
	        System.out.println(a.MovieName+" Movie_Details ");
	        System.out.println("Movie Name :"+a.MovieName);
	        System.out.println("Movie Budget :"+a.MovieBudget);
	        System.out.println("Movie Release Date :"+a.MovieReleaseDate);
	        System.out.println("Theatre Name :"+TheatreName);
	        System.out.println("Theatre Location :"+TheatreLocation);
	        System.out.println(" ");
	        Movie b=new Movie();
	        
	        b.MovieName = "Irumudi";
	        b.MovieBudget= 15000000;
	        b.MovieReleaseDate=LocalDate.of(202, 6, 14);
	       
	        System.out.println(b.MovieName+" Movie_Details ");
	        System.out.println("Movie Name :"+b.MovieName);
	        System.out.println("Movie Budget :"+b.MovieBudget);
	        System.out.println("Movie Release Date :"+b.MovieReleaseDate);
	        System.out.println("Theatre Name :"+TheatreName);
	        System.out.println("Theatre Location :"+TheatreLocation);
	        System.out.println(" ");

	        Movie c=new Movie();
	        
	        c.MovieName = "Hanuman";
	        c.MovieBudget= 75000000;
	        c.MovieReleaseDate=LocalDate.of(202, 6, 14);
	       
	        System.out.println(c.MovieName+" Movie_Details ");
	        System.out.println("Movie Name :"+c.MovieName);
	        System.out.println("Movie Budget :"+c.MovieBudget);
	        System.out.println("Movie Release Date :"+c.MovieReleaseDate);
	        System.out.println("Theatre Name :"+TheatreName);
	        System.out.println("Theatre Location :"+TheatreLocation);
	        System.out.println(" ");

	        Movie d=new Movie();
	        
	        d.MovieName = "Ramdasu";
	        d.MovieBudget= 5000000;
	        d.MovieReleaseDate=LocalDate.of(2025, 6, 14);
	       
	        System.out.println(d.MovieName+" Movie_Details ");
	        System.out.println("Movie Name :"+d.MovieName);
	        System.out.println("Movie Budget :"+d.MovieBudget);
	        System.out.println("Movie Release Date :"+d.MovieReleaseDate);
	        System.out.println("Theatre Name :"+TheatreName);
	        System.out.println("Theatre Location :"+TheatreLocation);
	        System.out.println(" ");

	        Movie e=new Movie();
	        
	        e.MovieName = "Ramayan";
	        e.MovieBudget= 307000000;
	        e.MovieReleaseDate=LocalDate.of(2027, 6, 14);
	       
	        System.out.println(e.MovieName+" Movie_Details ");
	        System.out.println("Movie Name :"+e.MovieName);
	        System.out.println("Movie Budget :"+e.MovieBudget);
	        System.out.println("Movie Release Date :"+e.MovieReleaseDate);
	        System.out.println("Theatre Name :"+TheatreName);
	        System.out.println("Theatre Location :"+TheatreLocation);
	}

}
