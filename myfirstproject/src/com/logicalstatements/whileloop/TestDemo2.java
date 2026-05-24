package com.logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
        sc.close();

	}

}
