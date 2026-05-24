package com.oops.abstraction;

public class Cat implements Animal {
	public String sound() {
		return "meow meow meow!!!";
	}
	public void walk() {
		System.out.println("cat walk is derived from cat itself!!!");
	}
	public void eat() {
		System.out.println("cat eats rat!!!");
	}
}
