package com.oops.abstraction;

public class Monkey implements Animal {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Kichkichkich!!";
	}

	@Override
	public void eat() {
		System.out.println("Monkey eats banana!!");
		
	}

	@Override
	public void walk() {
		System.out.println("Monkey walks and climbs Trees!!!");
		
	}
	
	public void run() {
		System.out.println("Monkey can run and also climbs");
	}

}
