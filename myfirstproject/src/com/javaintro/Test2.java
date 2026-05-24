package com.javaintro;
//static related information
public class Test2 {
	
//static variables
//declaration and initialization
	static int id=1;
	static String name="vcube";
	
	//block
	static {
		System.out.println("hello static block!");
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("main method started");
		
		//accessing the data
		System.out.println(id);
		System.out.println(name);
		
		

	}

}
