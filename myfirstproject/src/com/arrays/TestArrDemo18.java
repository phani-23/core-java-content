package com.arrays;

public class TestArrDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[][] a = {{10,20},{20,30}};
		int[][] b = {{10,20},{20,30},{30,40}};


		int[][] result = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (i < a.length) {
					result[i][j] = a[i][j] + b[i][j];
				} else {
					result[i][j] = b[i][j];
				}
			}
		}

		for (int[] p1 : result) {
			for (int p : p1) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}

}
