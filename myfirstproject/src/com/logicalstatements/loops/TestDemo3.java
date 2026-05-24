package com.logicalstatements.loops;

public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int index=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				if(index%2==0) {
					System.out.println("index : "+index +"-->" +i);
					
				}
				index++;
			}
		}

	}

}
