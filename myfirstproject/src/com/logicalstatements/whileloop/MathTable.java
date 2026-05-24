package com.logicalstatements.whileloop;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to print the table: ");
		int n = sc.nextInt();
		System.out.println("enter number where the table should end: ");
		int end = sc.nextInt();
		int i = 1;
		while (i <= end) {
			System.out.println(n + "X" + i + "=" + n * i);
			i++;
		}
		sc.close();
	}
}
