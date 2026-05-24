package com.javaintro;

public class Test7 {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		// address of the object=79fc0f2f-->null
		Test7 t=new Test7();
		//50040f0c---->79fc0f2f
		Test7 t1=new Test7();
		//2dda6444---->50040f0c
		Test7 t2=new Test7();
		//50040f0c
		Test7 t3=new Test7();
//		t3=t2;
		t=null;
		
		System.gc();
		
	
		System.out.println(t);
		//System.out.println(t.hashCode());
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
		
		System.out.println("main method ended");

	}

}
