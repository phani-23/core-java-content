package com.logicalstatements.patterns;

public class DiamondPattern {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<i;k++) {
				System.out.print(i);
			}
			for(int p=1;p<=i;p++) {
				System.out.print(i);
			}
			for(int l=1;l<=i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int m=1;m<=6;m++) {
			for(int n=1;n<=m;n++) {
			    System.out.print(" ");
			}
			for(int o=6;o>m;o--) {
				System.out.print(m);
			}
			for(int r=6;r>=m;r--) {
				System.out.print(m);
			}
			for(int p=1;p<=m;p++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
