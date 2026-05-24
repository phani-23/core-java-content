package com.oops;

interface Vehicle1{
	public void start();
}

class Bus implements Vehicle1{
	public void start() {
		System.out.println("Bus Started!!!");
	}
}

public class Main{
	public static void main(String[] args) {
		Vehicle1 c=new Bus();
		c.start();
	}
}