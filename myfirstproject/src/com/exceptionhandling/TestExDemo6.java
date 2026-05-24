package com.exceptionhandling;

public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try");
			int c=100/2;
			System.out.println("phaniKrishna".charAt(c));
			System.out.println(10/0);
			
			String s=null;
			System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.err.println("in catch of AE");
		}catch(NullPointerException e) {
			System.err.println("in catch of NE");
		}catch(RuntimeException e) {
			System.err.println("in catch of RE");
		}catch(Exception e) {
			System.err.println("in catch of E");
		}catch(Throwable e) {
			System.err.println("in catch of T");
		}
		System.out.println("main method ended");
	}

}
