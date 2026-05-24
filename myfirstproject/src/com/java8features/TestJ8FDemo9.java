package com.java8features;




public class TestJ8FDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Runnable t1=() ->{
			for(int i=0;i<=10;i++) {
				System.out.println("run: "+i);
			}
		};
		
		Thread t=new Thread(t1);
		
		t.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("main: "+i);
		}
		System.out.println("main method ended");
	}

}
