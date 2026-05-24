package com.collectionframeworks;
//Comparable
public class Employee implements Comparable<Employee> {
	int eid;
	String ename;
	double esal;
	long phone;
	
	public Employee(int eid, String ename, double esal, long phone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", phone=" + phone + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.eid<o.eid) {
			return -1;
		}else if(this.eid>o.eid) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
}
