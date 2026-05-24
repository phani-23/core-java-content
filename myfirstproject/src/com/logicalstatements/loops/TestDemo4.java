package com.logicalstatements.loops;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int index=1;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				if(index%2==0) {
				System.out.println("index: "+index +"--> "+i);
			}
				index++;
				}
			
		}

	}
}
