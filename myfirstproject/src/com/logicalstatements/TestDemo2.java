package com.logicalstatements;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your marks: ");
			double marks = sc.nextDouble();
			if (marks > 100 || marks < 0) {
				System.out.println("invalid marks");
			} else if (marks >= 90) {
				System.out.println("A grade");
			} else if (marks >= 80) {
				System.out.println("B grade");
			} else if (marks >= 70) {
				System.out.println("C grade");
			} else if (marks >= 60) {
				System.out.println("D grade");
			} else if (marks >= 50) {
				System.out.println("E grade");
			} else if (marks >= 35) {
				System.out.println("passed");
			} else if (marks < 35) {
				System.out.println("failed");
			}
		}
	}

}
