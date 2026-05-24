package com.tandemLoop;

import java.util.Scanner;

class Calculator {
	double a;
	double b;
	String operation;

	public double doCalculation() {
		if (operation.equalsIgnoreCase("add")) {
			return a + b;
		} else if (operation.equalsIgnoreCase("subtract")) {
			return a - b;
		} else if (operation.equalsIgnoreCase("multiply")) {
			return a * b;
		} else if (operation.equalsIgnoreCase("divide")) {
			if (b == 0) {
				System.out.println("Cannot divide by zero");
				return 0;
			}
			return a / b;
		} else {
			System.out.println("Invalid operation");
			return 0;
		}
	}
}

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator c = new Calculator();

		System.out.print("Enter value for a: ");
		c.a = sc.nextDouble();

		System.out.print("Enter value for b: ");
		c.b = sc.nextDouble();

		System.out.print("Enter operation (add/subtract/multiply/divide): ");
		c.operation = sc.next();

		double result = c.doCalculation();
		System.out.println("Result = " + result);

		sc.close();

	}

}
