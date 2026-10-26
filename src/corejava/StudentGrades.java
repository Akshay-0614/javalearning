//Write a java program to print grades of the students marks using scanner to accept the marks and if else .

package corejava;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {

		// Create a Scanner Object to accept input from the user
		Scanner sc = new Scanner(System.in);

		// Accept Student Marks
		System.out.println("Enter Student Marks : ");
		int marks = sc.nextInt();

		// Check Marks and Print corresponding Grade
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid Marks");
		} else if (marks >= 90) {
			System.out.println("Garde A+ ");
		}

		else if (marks >= 80) {
			System.out.println("Garde B+ ");
		}

		else if (marks >= 70) {
			System.out.println("Garde C+ ");
		}

		else if (marks >= 60) {
			System.out.println("Garde D+ ");
		}

		else if (marks >= 50) {
			System.out.println("Garde E+ ");
		} else if (marks >= 35) {
			System.out.println("Garde E ");
		}

		else {
			System.out.println("Grade F : Failed");
		}

		// Close the Scanner
		sc.close();
	}

}
