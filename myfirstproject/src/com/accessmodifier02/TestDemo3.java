package com.accessmodifier02;

import com.accessmodifier01.TestDemo1;

public class TestDemo3 extends TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started from TestDedmo3");
		
//		TestDemo1 t1=new TestDemo1();
//		accessing the protected data outside the package of subclass with subclass object reference only.		
		TestDemo3 t=new TestDemo3();
		System.out.println(t.id4);
		System.out.println(t.name4);
		t.method4();
		
		//accessing the default data outside the package is not possible
//		TestDemo1 t1=new TestDemo1();
//		System.out.println(t1.id2);
//		System.out.println(t1.name2);
//		t1.method2();
		
		// accessing the public data outside the package is possible
//		System.out.println(t1.id3);
//		System.out.println(t1.name3);
//		t1.method3();
		
		//accessing the protected data outside the package is not possible
//		TestDemo1 t1=new TestDemo1();
//		System.out.println(t1.id4);
//		System.out.println(t1.name4);
//		t1.method4();

	}

}
