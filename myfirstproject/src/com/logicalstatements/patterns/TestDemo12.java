package com.logicalstatements.patterns;

public class TestDemo12 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(" ");
			} 
			int num=1;
			for(int k=1;k<=3;k++){
				System.out.print(num+ " ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}

	}

}
