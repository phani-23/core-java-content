package com.oops.abstraction;

public class PayRollSystem {

	public static void main(String[] args) {
		// Create FullTimeEmployee object
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Phani", 101, 50000);
        System.out.println("Full-Time Employee Details:");
        fullTimeEmp.display();
        System.out.println("Total Salary: ₹" + fullTimeEmp.calculateSalary());

        System.out.println("***************************************");

        // Create PartTimeEmployee object
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Krishna", 102, 120, 250);
        System.out.println("Part-Time Employee Details:");
        partTimeEmp.display();
        System.out.println("Total Salary: ₹" + partTimeEmp.calculateSalary());


	}

}
