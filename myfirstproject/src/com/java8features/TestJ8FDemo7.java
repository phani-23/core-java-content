package com.java8features;

@FunctionalInterface
interface TestIn3{
	int multliplication(int a,int b);
}

public class TestJ8FDemo7 {

	public static void main(String[] args) {
		TestIn3 t3=(a,b)->{
			return a*b;
		};
		System.out.println(t3.multliplication(5, 30));
	}

}
