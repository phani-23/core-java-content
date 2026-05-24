package com.tandemLoop;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			a = a - 1;
		}

		int num = 1;
		while (num <= (2 * a - 1)) {
			System.out.print(num);
			if (num < (2 * a - 1))
				System.out.print(", ");
			num = num + 2;
		}
		sc.close();
	}

}
