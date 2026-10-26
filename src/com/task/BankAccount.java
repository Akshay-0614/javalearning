//Create a Java class BankAccount with a static variable balance initialized to 1000, 
// create deposit(int amount) and withdraw(int amount) methods to update the balance, and in the main() method perform a deposit of 500, a withdrawal of 300, and print the final balance.

package com.task;

public class BankAccount {

	// stores the current bank account balance
	static int balance = 1000;

	// Deposits the given amount into the account
	static void deposit(int amount) {

		// Adds the deposited amount to the current balance
		balance = balance + amount;
		System.out.println("The Amount got Deposited : " + amount);

	}

	// Withdraws the given amount from the account
	static void withdraw(int amount) {

		// Subtracts the withdrawn amount from the current balance
		balance = balance - amount;
		System.out.println("The Amount got Withdrawn : " + amount);
	}

	// Displays the current account balance
	static void checkBalanace() {
		System.out.println("Total Balance : " + balance);
	}

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println(" ");

		// Depositing 500 into the account
		deposit(500);

		// Withdrawing 300 from the account
		withdraw(300);

		// Displays the final amount
		checkBalanace();

		System.out.println(" ");
		System.out.println("Main Method Ended ");

	}

}
