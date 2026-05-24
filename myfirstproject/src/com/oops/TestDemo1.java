package com.oops;

 class TestDemo2{
	int a=10;
	static String name="Phani";
	static  int b=100;
	public static void main(String[] args) {
		System.out.println("main method started from TestDemo2");
		TestDemo2.b=200;
	}
}

public class TestDemo1 extends TestDemo2 {
	void hello(){
//		a=20;
		name="krishna";
		System.out.println(a);
		System.out.println(name);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println("main method started from TestDemo1");
		TestDemo1 t=new TestDemo1();
		t.hello();
	}

}
