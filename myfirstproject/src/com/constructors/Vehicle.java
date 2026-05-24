package com.constructors;

public class Vehicle {
	String name;
	double price;
	
	Vehicle(){
		this("Fz-s",200000.00);
		System.out.println("no arg constructor called from Vehicle");
	}
	
	

	public Vehicle(String name, double price) {
		System.out.println("two arg constructor called");
		this.name = name;
		this.price = price;
	}



	public static void main(String[] args) {
		System.out.println("main method started from vehicle ");
		

	}

}

class Bike extends Vehicle{
	
	Bike(){
		super();
		System.out.println("no arg constructor called from Bike");
	}
	public static void main(String[] args) {
		System.out.println("main method started from bike!");
		
		Bike b=new Bike();
		System.out.println(b.name);
		System.out.println(b.price);
	}
}
