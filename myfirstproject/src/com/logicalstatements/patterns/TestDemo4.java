package com.logicalstatements.patterns;

public class TestDemo4 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i=1;i<7;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
