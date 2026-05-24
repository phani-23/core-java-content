package com.constructors;

import java.util.Scanner;

public class Cart {
	double item1;
	double item2;
	double item3;
	double total;

	Cart(double item1, double item2, double item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;

		total = item1 + item2 + item3;

	}

	void items() {
		System.out.println("Price of Item1 : " + item1);
		System.out.println("Price of Item2 : " + item2);
		System.out.println("Price of Item3 : " + item3);

	}

	void calBill() {

		System.out.println("Total Amount : " + total);

		if (total > 5000) {
			double distotal = total * 0.10;

			total = total - distotal;

			System.out.println("Total Amount  After Discount  : " + total);

		}

	}

	void cal() {
		double gstamount = total * 0.18;

		double gsttotal = total + gstamount;

		System.out.println("Total Amount after GST : " + gsttotal);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter price of 1st item : ");

		double item1 = sc.nextDouble();
		System.out.println("Enter price of 2nd item : ");

		double item2 = sc.nextDouble();
		System.out.println("Enter price of 3rd item : ");

		double item3 = sc.nextDouble();

		System.out.println("-----------------------------------------------");

		System.out.println("Bill of Cart 1");

		Cart c1 = new Cart(item1, item2, item3);
		c1.items();
		c1.calBill();
		c1.cal();
		System.out.println("========================================================");

		System.out.println("Enter price of 1st item : ");
		double j1 = sc.nextDouble();

		System.out.println("Enter price of 2nd item : ");
		double j2 = sc.nextDouble();

		System.out.println("Enter price of 3rd item : ");
		double j3 = sc.nextDouble();

		System.out.println("-----------------------------------------------");

		System.out.println("Bill of cart 2");

		Cart c2 = new Cart(j1, j2, j3);
		c2.items();
		c2.calBill();
		c2.cal();

		sc.close();

	}

}
