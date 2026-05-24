package com.javaintro;

public class Cricketer {
	
	//declaration
	//instance or non static variables
	int jerseyno;
	String name;
	
	//static variables
	static int countryId=91;
	static String countryName="India";

	public static void main(String[] args) {
		System.out.println("main method started!");
		System.out.println("Welcome to Indian Cricket Team!");
		
		System.out.println("********object 1 info");
		
		//creating an object of a class
		
		Cricketer d=new Cricketer();
		//Assigning the data
//		countryId=91;
//		countryName="India"; we can assign static data in class level ...
		
		d.jerseyno=7;
		d.name="Dhoni";
		
		//accessing static data is possible
		System.out.println("Country ID: "+countryId);
		System.out.println("Country Name: "+countryName);
		
		//accessing instance data
		//instance data we cannot access directly
		//if we want to access instance data , we must need to create an object
		System.out.println("Jersey NO:" +d.jerseyno);
		System.out.println("Cricketer Name: "+d.name);
		
		System.out.println("********object 2 info");
		
		Cricketer v=new Cricketer();
		v.jerseyno=18;
		v.name="Virat";
		System.out.println("Country ID: "+countryId);
		System.out.println("Country Name: "+countryName);
		System.out.println("Jersey NO:" +v.jerseyno);
		System.out.println("Cricketer Name: "+v.name);
		
		System.out.println("********object 3 info");
		
		
		Cricketer r=new Cricketer();
		countryId=92;
		countryName="bharat";
		r.jerseyno=45;
		r.name="Rohit";
		System.out.println("Country ID: "+countryId);
		System.out.println("Country Name: "+countryName);
		System.out.println("Jersey NO:" +r.jerseyno);
		System.out.println("Cricketer Name: "+r.name);
		
		
		System.out.println("********object 4 info");
		
		
		Cricketer j=new Cricketer();
		j.jerseyno=8;
		j.name="Jadeja";
		System.out.println("Country ID: "+countryId);
		System.out.println("Country Name: "+countryName);
		System.out.println("Jersey NO:" +j.jerseyno);
		System.out.println("Cricketer Name: "+j.name);
		
		System.out.println("********object 5 info");
		
		Cricketer g=new Cricketer();
		g.jerseyno=23;
		g.name="Phani";
		System.out.println("Country ID: "+countryId);
		System.out.println("Country Name: "+countryName);
		System.out.println("Jersey NO:" +g.jerseyno);
		System.out.println("Cricketer Name: "+g.name);
		
System.out.println("********object 6 info");
		
		Cricketer h=new Cricketer();
//		g.jerseyno=33;
//		g.name="HardikPandya";
		System.out.println("Country ID: "+countryId);
		System.out.println("Country Name: "+countryName);
		System.out.println("Jersey NO:" +h.jerseyno);
		System.out.println("Cricketer Name: "+h.name);
		
		
		

	}

}
