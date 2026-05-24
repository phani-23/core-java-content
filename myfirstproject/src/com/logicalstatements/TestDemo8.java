package com.logicalstatements;

import java.util.Scanner;

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the n1 number: ");
			int n1=sc.nextInt();
			System.out.println("enter the n2 number: ");
			int n2=sc.nextInt();
			System.out.println("enter the symbol to do the opertaion?");
			String sym=sc.next();
			
			switch(sym) {
			case "+","sum" ->System.out.println("addition of two numbers: "+(n1+n2));
			case "-","sub" ->System.out.println("subtraction of two numbers: "+(n1-n2));
			case "*","mul" ->System.out.println("multiplication of two numbers: "+(n1*n2));
			case "%","mod" ->System.out.println("reminder of two numbers: "+(n1%n2));
			case "/","div" ->System.out.println("quotient of two numbers: "+(n1/n2));
			}
		}

	}

}
