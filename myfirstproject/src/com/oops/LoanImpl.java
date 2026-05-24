package com.oops;

import java.util.Scanner;

public class LoanImpl implements Loan {

	static Scanner sc = new Scanner(System.in);

	public String getAddressDetails() {
		String address = "";
		System.out.println("enter your flat no: ");
		String flat = sc.next();
		System.out.println("enter your plot: ");
		String plot = sc.next();
		System.out.println("enter your street: ");
		String street = sc.next();
		System.out.println("enter your city: ");
		String city = sc.next();
		System.out.println("enter the pincode: ");
		long pin = sc.nextLong();

		address = "Flatno: " + flat + "plot no: " + plot + "Street: " + street + "City: " + city + "pincode: " + pin;
		return address;
	}

	public boolean isAadharAndPanDetails() {

		System.out.println("Enter your Aadhaar number:");
		String aadhar = sc.next();

		// Aadhaar validation: exactly 12 digits
		if (!aadhar.matches("\\d{12}")) {
			System.out.println("Invalid Aadhaar number. It must be exactly 12 digits.");
			return false;
		}

		System.out.println("Enter your PAN number:");
		String pan = sc.next();

		// PAN validation: 5 letters + 4 digits + 1 letter
		if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Invalid PAN number. It must be in format: ABCDE1234F");
			return false;
		}

		System.out.println("✅ Aadhaar and PAN details are valid!");
		return true;
	}

	double getROI() {
		return 9.5;
	}

	public int getCibilScore() {
		System.out.println("enter your cibil score: ");
		int cibil = sc.nextInt();
		return cibil;
	}

	public double getCustomerSal() {
		System.out.println("enter your salary: ");
		double salary = sc.nextDouble();
		return salary;
	}
}
