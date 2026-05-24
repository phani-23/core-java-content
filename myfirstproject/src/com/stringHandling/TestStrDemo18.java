package com.stringHandling;

public class TestStrDemo18 {

	public static void main(String[] args) {
		String str="Phani";//0 1 2 3 4
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println("********************");
		StringBuilder sb1=new StringBuilder(str);
		System.out.println(sb1.reverse());
		System.out.println("*********************");
		byte[] ab=str.getBytes();
		System.out.println("The reverse String: ");
//		for(int i=ab.length-1;i>=0;i--) {
//			System.out.print((char)ab[i]);
//		}
		
		int start=0;
		int end=ab.length-1;
		int temp=0;
		
		while(start<end) {
			temp=ab[start];
			ab[start]=ab[end];
			ab[end]=(byte) temp;
			start++;
			end--;
		}
		
		String rev=new String(ab);
		System.out.println(rev);
	}

}
