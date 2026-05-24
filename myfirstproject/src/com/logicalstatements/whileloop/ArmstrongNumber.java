package com.logicalstatements.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		int temp=n;
		int r = 0;
		int sumP = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sumP = sumP + r * r * r;
		}
		System.out.println("Number is: "+sumP);
		if(temp==sumP) {
			System.out.println("the given number is Armstrong Number");
		}else {
			System.out.println("the given number is not Armstrong Number");
		}
		sc.close();
	}

}
