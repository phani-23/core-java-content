package com.javaintro;

public class Test6 {
//	native methods do not specify body
//	native void hello() {
//		
//	}

	native void hello();
	
	public static void main(String[] args) {
		System.out.println("main method started with string args in Test6");
		main();
		main();
		main();
		main();
		main();
		main();
		main();

//		Test6 t=new Test6();
//		t.hello();
	}
	
	public static void main(int[] args) {
		System.out.println("main method started with int args");

	}
	
	public static void main() {
		System.out.println("main method started with no args in Test6");

	}
	
	public static void main(String args) {
		System.out.println("main method started form Test6");

	}

}
