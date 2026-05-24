package com.arrays;

public class TestArrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] i = { 1, 2, 3, 4, 5, 6 };
		for (int n : i) {
			System.out.println(n);
		}
		System.out.println("************************");
		for (int p = 0; p < i.length; p++) {
			System.out.println(i[p]);
		}

		System.out.println("main method ended");
	}

}
