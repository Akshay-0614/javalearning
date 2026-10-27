package consoleprojects;

import java.util.Scanner;

public class JobEligibility {

	public static void main(String[] args) {

		System.out.println("*****JOB ELIGIBILITY SYSTEM*****");
		System.out.println("   ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Full Name : ");
		String name = sc.nextLine();
		System.out.println("   ");

		System.out.println("Enter your email : ");
		String email = sc.nextLine();
		System.out.println("   ");

		System.out.println("Are You A graduate Student(yes/no) : ");
		String degree = sc.nextLine();
		System.out.println("   ");

		if (degree.equalsIgnoreCase("yes")) {

			System.out.println("Do you have any knowledge on java(yes/no) : ");
			String Java = sc.nextLine();
			if (Java.equalsIgnoreCase("yes")) {

				System.out.println("   ");
				System.out.println("Let me Know one more Language from you");
				System.out.println("Do You have knowledge on Sql (yes/no) : ");
				String Sql = sc.nextLine();

				if (Sql.equalsIgnoreCase("yes")) {
					System.out.println("   ");
					System.out.println("Congratulations " + name + " !!!");
					System.out.println("You are selected for Initial screening round,Be ready for it");

					System.out.println("   ");
					System.out.println("Please answer below questions before screening get start");
					System.out.println("Do you have communication skill in english (yes/no) : ");
					String Commskill = sc.nextLine();

					if (Commskill.equalsIgnoreCase("yes")) {

						System.out.println("   ");
						System.out.println("Nice " + name + " The Screening will start in 10 minutes be ready... ");
					} else {
						System.out.println("Sorry" + name + "For this role communication is mandatory...");
					}
				} else {
					System.out.println("Sorry " + name + " You are not eligible fro this role");
				}
			}

			else {
				System.out.println("We are sorry basic knowledge of java is required");
			}
		} else {
			System.out.println("Sorry,Graduation is required");

		}
		sc.close();
	}

}
