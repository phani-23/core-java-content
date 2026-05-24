package com.constructors;

public class Vehicle1 {
	
	int VehicleNo;
	
	Vehicle1(){
		System.out.println("no arg constructor from Vehicle1");
	}

	public static void main(String[] args) {
		System.out.println("main method started form vehicle1");

	}

}

class Scooty extends Vehicle1{
	
	Scooty(){
		super();
		System.out.println("no arg constructor from scooty");
	}
	public static void main(String[] args) {
		System.out.println("main method started from scooty");
		Scooty s1=new Scooty();
		s1.display();
		
		
	}
	
	void display() {
		System.out.println("Vehicleno: "+VehicleNo);
	}
}