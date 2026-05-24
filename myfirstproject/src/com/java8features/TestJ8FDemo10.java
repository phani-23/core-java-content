package com.java8features;

@FunctionalInterface
interface TestIn5{
	void method6();
}
@FunctionalInterface
interface TestIn6 extends TestIn5{
//	void method7();
}

public class TestJ8FDemo10 {

	public static void main(String[] args) {
		TestIn6 t=()-> System.out.println("Hello method 6");
		t.method6();
	}

}
