package com.logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		int r = 0;
		String s = "";
//		int arr[] = new int[127];
//		int i = 0;

		while (n != 0) {
			r = n % 2;
			n = n / 2;
//			arr[i] = r;
//			i++;
			s = r + s;
		}
		System.out.println("the binary number is :" + s);
//		for (int j = i - 1; j >= 0; j--) {
//		System.out.print(arr[j] + " ");
//	}

		sc.close();
	}

}
