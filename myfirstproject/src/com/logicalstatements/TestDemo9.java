package com.logicalstatements;

import java.util.Scanner;

public class TestDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the category: ");
			String category = sc.next();

			switch (category) {
			case "fruits" -> {
				System.out.println("enter the fruit name: ");
				String item = sc.next();
				switch (item) {
				case "org" -> System.out.println("oranges per piece: " + 25 + "rupees");
				case "apl" -> System.out.println("apples per piece: " + 30 + "rupees");
				case "bnn" -> System.out.println("banana per piece: " + 15 + "rupees");
				default -> System.out.println("your mentioned item is out of stock!!!");
				}
			}
			case "veg" -> {
				System.out.println("enter the vegetable name: ");
				String item = sc.next();
				switch (item) {
				case "tmt" -> System.out.println("tomatoes per kg is: " + 30 + "rupees");
				case "pot" -> System.out.println("potatoes per kg is: " + 40 + "rupees");
				case "bjl" -> System.out.println("brinjal per kg is: " + 45 + "rupees");
				default -> System.out.println("your mentioned item is out of stock!!!");
				}
			}
			}
		}

	}

}
