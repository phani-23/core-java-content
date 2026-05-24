package com.java8features;

@FunctionalInterface
interface TestIn1 {
	void hello();
}

public class TestJ8FDemo5 {

	public static void main(String[] args) {
		TestIn1 t1 = () -> {
			System.out.println("The very  simple concept in java is  Java 8 features");

		};
		t1.hello();

	}

}
