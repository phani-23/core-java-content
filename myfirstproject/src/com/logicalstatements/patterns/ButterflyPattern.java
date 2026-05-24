package com.logicalstatements.patterns;

public class ButterflyPattern{

	public static void main(String[] args) {
		
		//up
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=6;k>i;k--) {
				System.out.print(" ");
			}
			for(int l=6;l>i;l--) {
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//down
		for(int a=1;a<=5;a++) {
			for(int b=5;b>=a;b--) {
				System.out.print("*");
			}
			for(int c=1;c<=a;c++) {
				System.out.print(" ");
			}
			for(int e=1;e<=a;e++) {
				System.out.print(" ");
			}
			for(int d=5;d>=a;d--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
