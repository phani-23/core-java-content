package com.oops;

public class PersonalLoan extends LoanImpl {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to presonal loan banking");

		PersonalLoan pl = new PersonalLoan();
		double salary = pl.getCustomerSal();
		int cibil = pl.getCibilScore();
		boolean result = pl.isAadharAndPanDetails();

		if (salary >= 800000.00 && cibil >= 750 && result) {
			System.out.println("congratulations your loan got approved!!");
			System.out.println("the current roi: " + pl.getROI());
			System.out.println("can you enter your address: ");
			String address = pl.getAddressDetails();

			System.out.println("your entered address details are: " + address);
		} else {
			System.out.println("sorry your loan got rejected");
		}

	}

}
