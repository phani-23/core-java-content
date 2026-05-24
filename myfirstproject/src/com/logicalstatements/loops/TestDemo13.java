package com.logicalstatements.loops;

public class TestDemo13 {

	void main() {
		System.out.println("main method started");
		int x = 10;
		int y = 20;
		x = x + y;// 30
		y = x - y;// 30-20 = 10
		x = x - y;// 30 -10 = 20
		System.out.println("X value : " + x);
		System.out.println("Y value : " + y);
		int n1 = 10;
		int n2 = 20;
		int temp = 0;
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("n1 value is: " + n1);
		System.out.println("n2 value is: " + n2);

	}

}
