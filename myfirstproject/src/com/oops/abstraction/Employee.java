package com.oops.abstraction;

public abstract class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	abstract double calculateSalary();

	void display() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee ID: " + id);
	}
}

class FullTimeEmployee extends Employee {
	double monthlySalary;

	public FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}

	@Override
	double calculateSalary() {
		return monthlySalary;

	}

}

class PartTimeEmployee extends Employee {
	int hoursWorked;
	double hourlyRate;

	public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return hoursWorked * hourlyRate;
	}
}