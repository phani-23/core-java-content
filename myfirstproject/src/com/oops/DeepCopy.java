package com.oops;
class Address1 {
    String city;
    String state;

    Address1(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Deep copy constructor
    Address1(Address1 other) {
        this.city = other.city;
        this.state = other.state;
    }
}


class Employee1 {
    String name;
    int id;
    Address1 address;

    Employee1(String name, int id, Address1 address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    // Deep copy constructor
    Employee1(Employee1 other) {
        this.name = other.name;
        this.id = other.id;
        this.address = new Address1(other.address); // deep copy of Address
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id +
                           ", City: " + address.city + ", State: " + address.state);
    }
}

public class DeepCopy {

	public static void main(String[] args) {
		Address1 addr1 = new Address1("Hyderabad", "Telangana");
        Employee1 emp1 = new Employee1("Phani", 101, addr1);

        // Deep copy of emp1
        Employee1 emp2 = new Employee1(emp1);

        // Modify original address
        emp1.address.city = "Khammam";

        // Display both employees
        emp1.display(); // City: Delhi
        System.out.println("*****************************************************************");
        emp2.display(); // City: Hyderabad


	}

}
