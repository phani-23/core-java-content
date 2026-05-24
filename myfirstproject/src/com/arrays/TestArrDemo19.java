package com.arrays;

public class TestArrDemo19 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[][] arr = { { 1, 2 }, { 2, 10 }, { 8, 9 }, { 1, 3 } };

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			int value = 0;
			for (int j = 1; j < n; j++) {
				if (i == j) {
					continue;
				}
				int start1 = arr[j][0];
				int end1 = arr[j][1];

				if (start <= start1 && end >= end1) {
					value = 1;
					break;
				} else {
					value = 0;
				}
			}
			System.out.print(value+" ");
		}

	}

}
