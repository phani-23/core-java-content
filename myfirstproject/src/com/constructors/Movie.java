package com.constructors;

public class Movie {
	
	String name;
	String hero;
	String heroine;
	String director;
	double budget;
	
	Movie(String director){
		System.out.println("one arg construtor");
		this.director=director;
	}
	Movie(Movie m,String hero, double budget){
		System.out.println("two arg constructor");
		this.director=m.director;
		this.hero=hero;
		this.budget=budget;
	}
	
	Movie(Movie m,String heroine,String name){
		System.out.println("three arg constructor ");
		this.director=m.director;
		this.hero=m.hero;
		this.budget=m.budget;
		this.name=name;
		this.heroine=heroine;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Movie m=new Movie("Sujith");
		m.show();
		
		Movie m1=new Movie(m,"pavan kalyan",25000000000.00);
		m1.show();
		
		Movie m2=new Movie(m1,"priyanka mohan","OG");
		m2.show();

	}
	
	void show() {
		System.out.println("**********************************");
		System.out.println("Name of the movie: "+name);
		System.out.println("Hero of the movie:"+hero);
		System.out.println("Heroine of the movie:"+heroine);
		System.out.println("Director of the movie:"+director);
		System.out.println("Budget of the movie:"+budget);
		System.out.println("***********************************");
	}

}
