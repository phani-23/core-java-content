package com.oops;

class Student implements Cloneable {
	int id;
	String name;
	Address adress;

	public Student(int id, String name, Address adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
}

class Address {
	String city;
	String street;

	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}

}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !");
		Address add = new Address("Hyderabad", "KPHB");
		System.out.println("Before clone !");
		Student s1 = new Student(1, "Srikanth", add);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.adress.city);
		System.out.println("After clone !");
		Student s2 = (Student) s1.clone();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.adress.city);
		s2.adress.city = "Vijayawada";
		System.out.println("*********************");
		System.out.println("************************");
		System.out.println(s1.name);
		System.out.println(s1.adress.city);
		System.out.println(s2.name);
		System.out.println(s2.adress.city);
		
		System.out.println("main method ended !");


	}

}
