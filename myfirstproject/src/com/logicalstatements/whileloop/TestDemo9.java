package com.logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			if (num % i == 0) {
				System.out.println("factors of the given number is: " + i);
			}
			i++;
		}
		sc.close();
	}

}
