package com.languagefundamentals;

class Employee{
	int eid=1;
	String empname="phani";
	double salary=100000.00;
	Address address=new Address();
	
}

class Address{
	int flatno=123;
	String plotno="LIG";
	String street="Road no2";
	String city="HYD";
	long pin=507002;
	
}

//driver class
public class TestEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		
		System.out.println("Employee details: ***********");
		System.out.println(e.eid);
		System.out.println(e.empname);
		System.out.println(e.salary);
		
		
		System.out.println("address of the employee******");
		System.out.println(e.address.flatno);
		System.out.println(e.address.plotno);
		System.out.println(e.address.street);
		System.out.println(e.address.city);
		System.out.println(e.address.pin);

	}

}
