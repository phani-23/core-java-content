package com.logicalstatements;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("is your half fee cleared as mentioned ");
			boolean isFeeCleared = sc.nextBoolean();

			if (isFeeCleared) {
				System.out.println("you can enter the class");
				System.out.println("have you attended the lab?");
				boolean labAttended = sc.nextBoolean();
				if (labAttended) {
					System.out.println("you can get recording classes");
					System.out.println("what is your fee due?");
					double feeDue = sc.nextDouble();
					if (feeDue <= 11000) {
						System.out.println("pay remaining fee by given due date!!");
					} else {
						System.out.println("you may not enter the class");
					}
				} else {
					System.out.println("you cannot get class recordings");
				}
			} else {
				System.out.println("you cannot enter the class");
			}
		}

	}

}
