package com.oops.abstraction;

public interface TestIn1 {

	void method1();
	void method2();
	void method3();
	void method4();
	void method5();
	 default void method6() {
		 System.out.println("method info!!");
	 }
	 static void method7() {
		 System.out.println("method info!!");
	 }
//	 private void method8() {
//		 System.out.println("method info!!");
//	 }
}
