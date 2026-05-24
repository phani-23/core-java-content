package com.stringHandling;

public class TestStrDemo21 {
	int id=22;
	String name="Phani";
	
	public String toString() {
		return "Info: ID: "+id+" Name: "+name;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestStrDemo21 t=new TestStrDemo21();
		System.out.println(t);
		System.out.println(t.toString());
		int a=0x27716f4;
		System.out.println(a);
		System.out.println(t.hashCode());
		System.out.println("******************");
		String s=new String("Phani");
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		System.out.println(System.identityHashCode(s));
		System.out.println("main method ended");

	}

}
