package com.logicalstatements.patterns;

public class TestDemo13 {

	public static void main(String[] args) {
		int rows = 5;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            int temp = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp += 1;
            }
            System.out.println();
            num=num+i;

	        }



	}

}
