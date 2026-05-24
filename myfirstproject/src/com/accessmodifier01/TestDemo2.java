package com.accessmodifier01;

public class TestDemo2  {
	
	public static void main(String[] args) {
		System.out.println("main method started from TestDemo2");
		
		//accessing the private data outside the class is not possible
		TestDemo1 t1=new TestDemo1();
//		System.out.println(t1.id1);
//		System.out.println(t1.name1);
//		t1.method1();
		
		//accessing the default data within the package
//		TestDemo1 t1=new TestDemo1();
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();
		
		//accessing the public data within the package
//		TestDemo1 t1=new TestDemo1();
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		
		//accessing the protected data within the package
//		TestDemo1 t1=new TestDemo1();
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

	}

}
