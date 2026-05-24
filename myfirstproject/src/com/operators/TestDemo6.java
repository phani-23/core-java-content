package com.operators;

public class TestDemo6 {

	public static void main(String[] args) {
		int x = 22;
		int y = 59;
		System.out.println(x++);// 22 -->23
		System.out.println(y++);// 59 -->60
		System.out.println(++x);// 24
		System.out.println(x++);// 24 --> 25
		System.out.println(--x);// 24
		System.out.println(y--);// 60 --> 59
		System.out.println(x--);// 24 --> 23
		System.out.println(++y);// 60
		System.out.println(y++);// 60 -->61
		System.out.println(y--);// 61 -->60
		System.out.println(x - 5);// 18
		System.out.println(y - 10);// 50
		System.out.println("x value  : " + x);// 23
		System.out.println("y value : " + y);// 60
		System.out.println(x++ + y++ + ++x + --y);

	}

}
