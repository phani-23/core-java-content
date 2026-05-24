package com.constructors;

public class Flower {
	
	String name="Lotus";

	public static void main(String[] args) {
		System.out.println("main method from flower");

	}

}

class Rose extends Flower {
	
	String name="Rose";
	public static void main(String[] args) {
		System.out.println("main method from Rose");
		Rose r=new Rose();
		r.show();
	}
	
	void show() {
		System.out.println(super.name);
		System.out.println(this.name);
	}
}