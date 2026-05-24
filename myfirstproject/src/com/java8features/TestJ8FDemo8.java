package com.java8features;
@FunctionalInterface
interface TestIn4{
	String show(String s);
}

public class TestJ8FDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TestIn4 t=a->a.toUpperCase();
		System.out.println(t.show("Java is Simple & Java is more Simple.."));

	}

}
