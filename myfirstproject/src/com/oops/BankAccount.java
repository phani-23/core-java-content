package com.oops;

public class BankAccount {
	private String accHolderName;
	private String accNumber;
	private double balance;

	public BankAccount(String accHolderName, String accNumber, double balance) {
		this.accHolderName = accHolderName;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("deposit: " + amount + " Balance: " + balance);
		} else {
			System.out.println("The amount should be positive!!!");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			if (amount <= balance) {
				balance = balance - amount;
				System.out.println("Amount withdrawn: " + amount + " Remaining balance: " + balance);
			} else {
				System.out.println("Your Account Has Insufficient Balance!!!!");
			}
		} else {
			System.out.println("The amount should be positive!!!");
		}
	}
}
