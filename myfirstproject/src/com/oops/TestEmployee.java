package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		//modifying the data
		e1.setEid(18);
		e1.setEname("kohli");
		e1.setPhone(9550638095L);
		e1.setSalary(100000.00);
		//reading the data
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getPhone());
		System.out.println(e1.getSalary());
		
//		direct access-->we should stop
//		System.out.println(e1.eid);
//		System.out.println(e1.ename);
//		System.out.println(e1.phone);
//		System.out.println(e1.salary);

	}

}
