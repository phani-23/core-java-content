package com.langfun.methods;

import java.util.Scanner;

public class TestDemo5 {
	
	 static Scanner sc = new Scanner(System.in);
	
	static double getEmpSalary(){
		System.out.println("enter emp salary: ");
		double sal=sc.nextDouble();
		return sal;
		}
	
	
	static double getEmpBonus() {
		System.out.println("enter emp Bonus:");
		double Bonus=sc.nextDouble();
		return Bonus;
		}

	public static void main(String[] args) {
		
		double salary=getEmpSalary();
		double Bonus=getEmpBonus();
		
		System.out.println("employe total salary: "+ (salary + Bonus));
		

	}

}
