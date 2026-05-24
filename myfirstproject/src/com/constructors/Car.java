package com.constructors;

public class Car {
	
	String model;
	String brand;
	double price;
	String color;
	
	//no argument constructor
	Car(){
		System.out.println("no arg constructor called!!");
		model="unknown";
		brand="unknown";
		color="unknown";
	}
	
	Car(String model,String brand,String color,double price){
		System.out.println("parameterized constructor called!!");
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
	}

	public static void main(String[] args) {
		System.out.println("main method started from car class!!");
		
		Car c1=new Car();
		c1.show();
		
		Car c2=new Car("Sonet","Kia","Red",1200000.00);
		c2.show();
		
		Car c3=new Car("Nexon","Tata","White",1500000.00);
		c3.show();

	}
	void show(){
		System.out.println("****************************");
		System.out.println("model of the car: "+model);
		System.out.println("brand of car: "+brand);
		System.out.println("price of car: "+price);
		System.out.println("color of car: "+color);
		System.out.println("****************************");
		
	}

}
