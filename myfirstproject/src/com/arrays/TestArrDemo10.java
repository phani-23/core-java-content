package com.arrays;

public class TestArrDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] numbers = { 12, 23, 24, 58, -89, 108, 8, 2, -55 };
		int min = numbers[0];
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			} else if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
