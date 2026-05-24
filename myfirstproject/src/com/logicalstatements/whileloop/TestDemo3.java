package com.logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemo3 {

	public static int getSumOfSquares(int num) {
		int sum = 0;
		while (num > 0) {
			int p = num % 10;
			sum =sum+ p * p;
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it's happy: ");
		int num = sc.nextInt();

		while (num != 1 && num != 4) {
			num = getSumOfSquares(num);
		}

		if (num == 1) {
			System.out.println("Happy Number!");
		} else {
			System.out.println("Not a Happy Number.");
		}

		sc.close();

	}

}
