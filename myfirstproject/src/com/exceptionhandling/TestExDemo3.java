package com.exceptionhandling;

public class TestExDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int[] a=new int[4];
		
		try {
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("main method ended");
	}

}
