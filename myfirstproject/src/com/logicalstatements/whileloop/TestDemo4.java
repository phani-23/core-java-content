package com.logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String yn = "";
		do {
			Scanner sc = new Scanner(System.in);

				System.out.println("enter a number:");
				int a = sc.nextInt();
				System.out.println("enter b number:");
				int b = sc.nextInt();
				System.out.println("enter the symbol to proceed opeartion");
				String s = sc.next();
				switch (s) {
				case "+" -> System.out.println("add:" + (a + b));
				case "-" -> System.out.println("sub:" + (a - b));
				case "*" -> System.out.println("mul:" + (a * b));
				case "%" -> System.out.println("mod:" + (a % b));
				case "/" -> System.out.println("div:" + (a / b));
				default -> System.out.println("invalid symbol");
				}
				System.out.println("Do you want to continue ..? Click Y for Yes N for No : ");
				yn = sc.next();
				sc.close();
		} while (yn.equalsIgnoreCase("Y"));
	}
	

}
