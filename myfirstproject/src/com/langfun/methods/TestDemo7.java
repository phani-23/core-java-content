package com.langfun.methods;

import java.util.Scanner;

public class TestDemo7 {
	
	static double findAreaofRecatangle(double l,double b) {
		double arRec=l*b;
		return arRec;
	}
	
	static double findAreaofTriangle(double b,double h ) {
		double arTri=0.5*b*h;
		return arTri;
	}
	
	static double findAreaofCircle(double radius) {
		return Math.PI*radius*radius;
	}
	
	static double findAreaofSquare(double side) {
		return side*side;
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("finding area of rectangle!");
			System.out.println("enter length:");
			double length=s.nextDouble();
			
			System.out.println("enter breadth:");
			double breadth=s.nextDouble();
			
			double arRec=findAreaofRecatangle(length,breadth);
			System.out.println("area of rectangle:"+arRec);
			System.out.println("***********************************************");
			
			System.out.println("find area of triangle");
			System.out.println("enter base:");
			double base=s.nextDouble();
			System.out.println("enter height:");
			double height=s.nextDouble();
			double arTri=findAreaofTriangle(base,height);
			System.out.println("area of triangle: "+arTri);
			
			System.out.println("******************************************");
			
			System.out.println("finding area of circle");
			System.out.println("enter radius: ");
			double r=s.nextDouble();
			double arCir=findAreaofCircle(r);
			System.out.println("area of circle: "+arCir);
			System.out.println("********************************************");
			
			System.out.println("finding area of square");
			System.out.println("enter side: ");
			double side=s.nextDouble();
			double arSqr=findAreaofSquare(side);
			System.out.println("area of square: "+arSqr);
			System.out.println("**************************************");
			
		
		
		}
		

	}

}
