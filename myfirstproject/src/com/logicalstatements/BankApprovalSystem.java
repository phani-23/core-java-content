package com.logicalstatements;

import java.util.Scanner;

public class BankApprovalSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("name of the applicant: ");
			String name = sc.next();
			System.out.println("enter the salary: ");
			double salary = sc.nextDouble();


			if (salary >= 50000) {

				System.out.println("your are approved for the process Mr: " + name);
				System.out.println("enter the CScore: ");
				int CScore = sc.nextInt();
				if (CScore >= 750) {
					System.out.println("Congratulations!!!you are approved for loan of amount more than 2,00,000!!");
				} else if (CScore >= 650 && CScore <= 749) {
					System.out.println("your application is  under process! you can get the loan");
				} else {
					System.out.println("your application for loan rejected!!");
				}

			} else if (salary >= 30000 && salary <= 49999) {
				System.out.println("you can approve for loan up to only 2 lakhs!!");
				System.out.println("to avail this your CScore should be more than 800!!! ");
				System.out.println("enter your CScore: ");
				int ClScore = sc.nextInt();
				if (ClScore >= 800) {
					System.out.println("your loan amount is rupees: 2,00,000");
				} else {
					System.out.println("your loan is rejected!!");
				}

			} else if(salary>=0&&salary<30000) {
				System.out.println("your salary is less than 30000! your application is rejected!!!");
			}else {
				System.out.println(" you gave a invalid amount!!");
			}
		}

	}

}
