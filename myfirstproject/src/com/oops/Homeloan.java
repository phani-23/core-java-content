package com.oops;

public class Homeloan extends LoanImpl {
	
	void getDocumentsInfo() {
		System.out.println("all documents submitted successfully");
	}
	
	void homeLoanBasicInfo() {
		System.out.println("home laon is very essesntial!!!");
	}
	@Override
	protected double getROI(){
		return 8.0;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to Home loan banking");

		Homeloan pl =new Homeloan();
		
		pl.getDocumentsInfo();
		pl.homeLoanBasicInfo();
		double salary = pl.getCustomerSal();
		int cibil = pl.getCibilScore();
		boolean result =pl.isAadharAndPanDetails();

		if (salary >= 600000.00 && cibil >= 700 && result) {
			System.out.println("congratulations your Home loan got approved!!");
			System.out.println("the current roi: " + pl.getROI());
			System.out.println("can you enter your address: ");
			String address = pl.getAddressDetails();

			System.out.println("your entered address details are: " + address);
		} else {
			System.out.println("sorry your loan got rejected");
		}

	}
}
