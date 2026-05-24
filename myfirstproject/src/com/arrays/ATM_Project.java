package com.arrays;

import java.util.Scanner;

public class ATM_Project {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] accNumbers = { 101, 102, 103 };
		int[] pins = { 1111, 2222, 3333 };
		double[] balances = { 5000.0, 8000.0, 6000.0 };

		System.out.println("-- Welcome to ATM --");
		System.out.print("Enter your Account Number: ");
		int accNo = sc.nextInt();

		// Validate Account
		int index = -1;
		for (int i = 0; i < accNumbers.length; i++) {
			if (accNumbers[i] == accNo) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("❌ Invalid Account Number!");
			return;
		}

		// PIN Validation
		System.out.print("Enter your PIN: ");
		int pin = sc.nextInt();

		if (pin != pins[index]) {
			System.out.println("❌ Incorrect PIN!");
			System.out.println("1. Forgot PIN");
			System.out.println("2. Exit");

			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Your default PIN is reset to 0000. Please change it.");
				pins[index] = 0000;
			} else {
				System.out.println("Thank you. Try again later.");
				return;
			}
		}

		int option;
		System.out.println("\n--- ATM Menu ---");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Change PIN");
		System.out.println("5. Exit");
		do {

			System.out.print("Choose option: ");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Your Balance: ₹" + balances[index]);
				break;

			case 2:
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmt = sc.nextDouble();
				if (withdrawAmt > 0 && withdrawAmt <= balances[index]) {
					balances[index] -= withdrawAmt;
					System.out.println("Withdraw successful. Remaining balance: ₹" + balances[index]);
				} else {
					System.out.println("❌ Insufficient balance or invalid amount.");
				}
				break;

			case 3:
				System.out.print("Enter amount to deposit: ");
				double depositAmt = sc.nextDouble();
				if (depositAmt > 0) {
					balances[index] += depositAmt;
					System.out.println("Deposit successful. New balance: ₹" + balances[index]);
				} else {
					System.out.println("❌ Invalid deposit amount!");
				}
				break;

			case 4:
				System.out.print("Enter new PIN: ");
				int newPin = sc.nextInt();
				pins[index] = newPin;
				System.out.println("PIN changed successfully!");
				break;

			case 5:
				System.out.println("Thank you for using ATM. Goodbye!");
				break;

			default:
				System.out.println("❌ Invalid option! Try again.");
			}

		} while (option != 5);

		sc.close();
	}
}