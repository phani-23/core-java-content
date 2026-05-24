package com.constructors;

public class Movie1 {
	
	String name;
	String hero;
	String heroine;
	String director;
	double budget;	
	
	Movie1(String name){
		this.name=name;
	}
	
	Movie1(Movie1 m,String hero, String heroine){
		this.name=m.name;
		this.hero=hero;
		this.heroine=heroine;
	}
	
	Movie1(Movie1 m,String director){
		this.hero=m.hero;
		this.heroine=m.heroine;
		this.name=m.name;
		this.director=director;
	}
	
	Movie1(Movie1 m,double budget){
		this.hero=m.hero;
		this.heroine=m.heroine;
		this.name=m.name;
		this.director=m.director;
		this.budget=budget;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Movie1 m=new Movie1("Peddi");
		m.display();
		
		Movie1 m1=new Movie1( m,"Ramcharan","Jhanvi kapoor");
		m1.display();
		
		Movie1 m2=new Movie1(m1,"Buchibabu");
		m2.display();
		
		Movie1 m3=new Movie1(m2,250000000);
		m3.display();
		

	}
	
	void display() {
		System.out.println("-------------------------------------");
		System.out.println("Movie name:"+name);
		System.out.println("Movie hero:"+hero);
		System.out.println("Movie heroine:"+heroine);
		System.out.println("Movie director:"+director);
		System.out.println("Movie budget:"+budget);
		System.out.println("-------------------------------------");
		
	}

}
