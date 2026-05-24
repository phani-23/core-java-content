package com.accessmodifier01;

public class TestDemo1 {
	//private constructor
	
//	 private TestDemo1(){
//		 
//	 }
	 
	//default constructor
	
//	 TestDemo1(){
//		 
//	 }
	 
	//public constructor
	
	 public TestDemo1(){
		 
	 }
	
	{
		System.out.println("instance block");
	}
	
	static {
		System.out.println("static block");
	}
	//private data
	private int id1=4;
	private String name1="abhishek";
	
	private void method1() {
		System.out.println("hello method1");
	}
	
	//default data
	
	int id2=33;
	String name2="hardik";
	
	void method2() {
		System.out.println("hello method2");
	}
	
	
	//public data
	
		public int id3=77;
		public String name3="gill";
		
		public void method3() {
			System.out.println("hello method3");
		}
		
		//protected data
		protected int id4=23;
		protected String name4="kuldeep";
		
		protected void method4() {
			System.out.println("hello method 4!!");
		}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		//accessing the private data within the class
		TestDemo1 t1=new TestDemo1();
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();

		
		//accessing the default data within the class
//				TestDemo1 t1=new TestDemo1();
				System.out.println(t1.id2);
				System.out.println(t1.name2);
				t1.method2();
				
				//accessing the public data within the class
//				TestDemo1 t1=new TestDemo1();
				System.out.println(t1.id3);
				System.out.println(t1.name3);
				t1.method3();
				
				
				//accessing the protected data within the class
//				TestDemo1 t1=new TestDemo1();
				System.out.println(t1.id4);
				System.out.println(t1.name4);
				t1.method4();

}
	}
