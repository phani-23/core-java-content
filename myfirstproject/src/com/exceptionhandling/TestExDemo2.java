package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String name="srikanth";
		System.out.println(name.length());
		
		String name1="null";
		System.out.println(name1.length());
		
		try {
		String name2=null;
		System.out.println(name2.length());//null dot any operation is NPE.
		}catch(Exception e){
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("main method ended!!");
	}

}
