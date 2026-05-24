package com.oops;

class Car extends Vehicle {
	@Override
	public void rent(int hours) {
		int cost = hours * 100;
		System.out.println("Rent of Car: " + cost + " for " + hours + " hrs");
	}
}

class Bike extends Vehicle {
	@Override
	public void rent(int hours) {
		int cost = hours * 50;
		System.out.println("Rent for Bike: " + cost + " for " + hours + " hrs");
	}

}

public class Vehicle {
	public void rent(int hours) {
		System.out.println("Rental cost for vehicle is 100 per : " + hours + " hrs");
	}

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.rent(1);
		
		v = new Car();
		v.rent(5);
		v.rent(3);
		
		v=new Bike();
		v.rent(5);
	

	}

}
