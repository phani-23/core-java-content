package com.logicalstatements.patterns;

public class Practice_pattern_18 {

	public static void main(String[] args) {
		int star = 1;
		int space = 4;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			if (i < 5) {
				star = star + 2;
				space = space - 1;
			} else {
				star = star - 2;
				space = space + 1;
			}
			System.out.println();
		}

	}

}
