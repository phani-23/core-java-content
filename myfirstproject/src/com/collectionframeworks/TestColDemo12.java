package com.collectionframeworks;

public class TestColDemo12 {
		
		int id;
		String name;
		long phone;
		double marks;
		
		
		
		@Override
		public String toString() {
			return "[id=" + id + ", name=" + name + ", phone=" + phone + ", marks=" + marks + "]";
		}



		public TestColDemo12(int id, String name, long phone, double marks) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.marks = marks;
		}
		
		

}
