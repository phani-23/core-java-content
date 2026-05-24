package com.logicalstatements;

import java.util.Scanner;

public class AirlineTicketFareSystem {

	public static void main(String[] args) {
		System.out.println("welcome to the Airline Ticket Fare System!!");
		double baseFare=5000;
try (//		System.out.println("your base fare amount for ticket is "+baseFare);
		Scanner sc = new Scanner(System.in)) {
			System.out.println("no of days booking in advance: ");
			int days=sc.nextInt();
			if(days>=30) {
				System.out.println("you get a discount of 20%: "+(baseFare=baseFare-(0.20*5000)));
				System.out.println("enter your age: ");
				int age=sc.nextInt();
				if(age<12) {
					System.out.println("you get a discount of 10%: "+(baseFare=baseFare-(0.10*5000)));
				}else if(age>60) {
					System.out.println("you get a discount of 15%: "+(baseFare=baseFare-(0.15*5000)));
				}else {
					System.out.println("you have to pay the baseFare of rupees: "+baseFare);
				}
			}else if(days<7){
				System.out.println("you have to pay the extra 25% amount: "+(baseFare=baseFare+(0.25*5000)));
			}else {
				System.out.println("your base fare amount for ticket is: "+baseFare);
			}
		}
		
	}

}
