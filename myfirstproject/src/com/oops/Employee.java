package com.oops;

//DTO : Data Transfer Object
//POJO : Plain Old Java Object
// Data Model
public class Employee {
	private int eid;
	private String ename;
	private long phone;
	private double salary;
	
	
	//setters and getters
	void setEid(int eid){
		this.eid=eid;
	}
	int getEid(){
		return eid;
	}
	
	void setEname(String ename) {
		this.ename=ename;
	}
	String getEname() {
		return ename;
	}
	
	void setPhone(long phone) {
		this.phone=phone;
	}
	long getPhone() {
		return phone;
	}
	
	void setSalary(double salary) {
		double bonus=20000.00;
		this.salary=salary+bonus;
	}
	double getSalary() {
		return salary;
	}
}
