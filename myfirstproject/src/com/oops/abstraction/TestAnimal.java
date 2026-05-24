package com.oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("main method started!!!");
		System.out.println("******Cat Info*********");
		Animal c=new Cat();//Up-casting Abstraction & Dynamic dispatching
		System.out.println(c.sound());
		c.eat();
		c.walk();
		c.run();
		Animal.breath();
		System.out.println("*******Dog Info*********");
		Animal d=new Dog();
		d.eat();
		d.walk();
		d.run();
		Animal.breath();
		System.out.println(d.sound());
		System.out.println("*******Monkey Info*********");
		Animal m=new Monkey();
		m.eat();
		m.walk();
		m.run();
		Animal.breath();
		System.out.println(m.sound());
		System.out.println(Animal.orgName);
	}

}
