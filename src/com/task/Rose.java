//Write a Java program to check whether the selected language is Java or HTML and display the login status.

package com.task;

public class Rose {

	public static void main(String[] args) {

		// Store the selected programming language
		String lang = "Java";

		// Check whether the selected language is Java or HTML
		if (lang == ("Java") || lang == ("HTMl")) {

			// Display the selected language
			System.out.println("Selected Language : " + lang);

			// Display the valid message
			System.out.println("The Language Is Valid.");
		} else {

			// Display invalid message
			System.out.println("Selected Language : " + lang);

			// Display invalid message
			System.out.println("The Language is not Valid");
		}
	}

}
