package com.java8features;
@FunctionalInterface
interface TestIn8{
	void hello();
}

interface TestIn7{
	void show();
	void disp();
}

public class TestJ8FDemo12 {

	public static void main(String[] args) {
		
		TestIn8 t1=()-> System.out.println("Hello method is called");
		t1.hello();
		
		TestIn7 t=new TestIn7() {
			
			@Override
			public void show() {
				System.out.println("Inner classes are comedy");
				
			}

			@Override
			public void disp() {
				System.out.println("disp method is called.");
				
			}
			
		};
		t.show();
		t.disp();
	}

}
