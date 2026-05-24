package com.oops;
class TestMI1{
	TestMI1(){
		System.out.println("no arg constructor Test1");
	}
}
class TestMI2 extends TestMI1{
	TestMI2(){
		System.out.println("no arg constructor Test2");
	}
}
class TestMI3 extends TestMI2{
	TestMI3(){
		System.out.println("no arg constructor Test3");
	}
}
public class TestInhDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TestMI3 t=new TestMI3();
		System.out.println(t);

	}

}
