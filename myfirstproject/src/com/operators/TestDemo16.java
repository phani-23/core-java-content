package com.operators;
class Animal{
	String name="Monkey";
}

class Dog extends Animal{
	String name="Dog";
}
public class TestDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Dog d=new Dog();
		System.out.println(d.name);
		Animal a=new Animal();
		System.out.println(a.name);
		
		System.out.println(d instanceof Animal);
		System.out.println(d instanceof Dog);
		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);

	}

}
