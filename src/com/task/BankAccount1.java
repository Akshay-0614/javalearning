//Write a Java program to create a Bank Account using a parameterized constructor and create a copy of the account using a copy constructor.
//Display the details of both the original and copied bank accounts.

package com.task;

public class BankAccount1 {

	long accountnumber;
	String accountholdername;
	double balance;
	String branch;

	// Parameterized constructor to initialize bank account details
	public BankAccount1(long account_number, String account_holdername, double balance, String branch) {

		this.accountnumber = account_number;
		this.accountholdername = account_holdername;
		this.balance = balance;
		this.branch = branch;

	}

	// Copy constructor to copy the details of another bank account
	public BankAccount1(BankAccount1 b) {

		this.accountnumber = b.accountnumber;
		this.accountholdername = b.accountholdername;
		this.balance = b.balance;
		this.branch = b.branch;

	}

	// Method to display bank account details
	public void bankInfo() {

		System.out.println("	Account Details		");
		System.out.println(" ");
		System.out.println("Account Number : " + accountnumber);
		System.out.println("Account Holder Name :" + accountholdername);
		System.out.println("Account Balance :" + balance);
		System.out.println("Account Branch : " + branch);

	}

	public static void main(String[] args) {

		System.out.println("	State Bank of India	  ");
		System.out.println(" ");
		
	    // Creating the original bank account
		System.out.println("Original Bank account");
		System.out.println(" ");
		BankAccount1 b1 = new BankAccount1(12346798, "Akshay kumar", 500000.00, "Mancherial");
		b1.bankInfo();

		System.out.println(" ");

		// Creating copied bank account using copy constructor
		System.out.println("Copied Bank Account");
		System.out.println(" ");
		BankAccount1 b2 = new BankAccount1(b1);
		
		// Changing copied account details
		b2.balance= 645544;
		b2.branch = "KPHB";
		b2.bankInfo();

	}

}
