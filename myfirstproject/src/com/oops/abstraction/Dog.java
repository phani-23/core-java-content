package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Bow Bow!!";
	}

	@Override
	public void eat() {
		System.out.println("Dog eats meat!!");
		
	}

	@Override
	public void walk() {
		System.out.println("Dog Walks!!");
		
	}

}
