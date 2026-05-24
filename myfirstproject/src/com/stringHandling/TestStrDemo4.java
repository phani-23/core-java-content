package com.stringHandling;

public class TestStrDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String[] names= {"phani","Krishna","Abhishek","TravisHead","klaseen","PatCummins"};
		for(String name:names) {
			if(name.startsWith("p")||name.endsWith("i")&& name.startsWith("A")||name.endsWith("s")) {
				System.out.println(name);
			}
		}
		System.out.println("********************************");
		for(String name:names) {
			if(name.toUpperCase().contains("A")) {
				System.out.println(name);
			}
		}
	}

}
