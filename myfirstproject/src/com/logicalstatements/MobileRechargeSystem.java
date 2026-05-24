package com.logicalstatements;

import java.util.Scanner;

public class MobileRechargeSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the plan amount: ");
			int amt=sc.nextInt();
			
			switch(amt) {
			case 199->System.out.println("your pack details are: 28 days, 1.5GB/Day " );
			case 399->System.out.println("your pack details are: 56 days, 1.5GB/Day " );
			case 599->System.out.println("your pack details are: 84 days, 2 GB/Day " );
			default->System.out.println("your entered amount plan doesnot exists!!!");
			}
		}

	}

}
