package com.logicalstatements;

import java.util.Scanner;

public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter jersey no: ");
			
			int jno=sc.nextInt();
			
			switch(jno) {
			case 4 -> System.out.println("Abhishek sharma");
			case 72 -> System.out.println("tilak varma");
			case 77 -> System.out.println("shubman gill");
			default -> System.out.println("unknown");
			}
		}
 
	}

}
