package com.arrays;

public class TestArrDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String[] names= {"Phani","Krishna","Rama","hanuman","Purvith","Kalki","Ramesh"};
		for(String s:names) {
			if(s.startsWith("P")) {
				System.out.print(s+" ");
			}
//			
//			if(s.startsWith("K")) {
//				System.out.print(s+" ");
//			}
//	
//			if(s.startsWith("R")) {
//				System.out.print(s+" ");
//			}
		}
	}

}
