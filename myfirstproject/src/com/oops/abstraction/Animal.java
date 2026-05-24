package com.oops.abstraction;

public interface Animal {
	
	public static final String orgName="Animal Park";
	
	public abstract String sound();
	
	public abstract void eat();
	
	public abstract void walk();
	
	private void hello() {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}
	default void run() {
		System.out.println("every animals can run!");
		hello();
	}
	
	static void breath() {
		System.out.println("Every animals can breath!!");
	}
}
