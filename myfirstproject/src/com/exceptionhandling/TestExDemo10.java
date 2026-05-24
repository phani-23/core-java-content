package com.exceptionhandling;

public class TestExDemo10 {

	public static void main(String[] args) {
		try {
			System.out.println("in try1");
			System.out.println(10/0);
			try {
				System.out.println("in try2");
				//System.out.println(10/0);
			}catch(Exception e1) {
				System.err.println("in catch2");
			}finally {
				System.out.println("in finally2");
			}
			
		}catch(Exception e) {
			System.err.println("in catch1");
			try {
				System.out.println("in try3");
				System.out.println(10/0);
			}catch(Exception e1) {
				System.err.println("in catch3");
			}finally {
				System.out.println("in finally3");
			}
			
			
		}finally {
			System.out.println("in finally1");
			
			try {
				System.out.println("in try4");
			}catch(Exception e1) {
				System.err.println("in catch4");
			}finally {
				System.out.println("in finally4");
			}
			
		}

	}

}
