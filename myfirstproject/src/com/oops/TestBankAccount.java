package com.oops;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Phani", "SBAT2025", 10000.00);
		System.out.println("Account Holder: " + acc.getAccHolderName());
		System.out.println("Account Number: " + acc.getAccNumber());
		System.out.println("Initial amount: " + acc.getBalance());

		acc.deposit(2000.0);
		acc.withdraw(7000.00);
		acc.withdraw(5000.00);
		acc.withdraw(100.00);
		acc.deposit(1000.00);
		acc.deposit(-1500.00);
		acc.withdraw(-300.00);
		acc.deposit(1064.00);
	}

}
