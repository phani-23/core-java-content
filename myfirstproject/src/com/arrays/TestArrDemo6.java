package com.arrays;

public class TestArrDemo6 {

	public static void main(String[] args) {
		byte[] b=new byte[3];
		short[] s=new short[3];
		int[] i=new int[3];
		long[] l=new long[3];
		float[] f=new float[3];
		double[] d=new double[3];
		boolean[] bo=new boolean[3];
		String[] str=new String[3];
		
		b[0]=1;
		b[1]=1;
		b[2]=1;
		
		s[0]=1;
		s[1]=1;
		s[2]=1;
		
		i[0]=1;
		i[1]=1;
		i[2]=1;
		
		l[0]=1;
		l[1]=1;
		l[2]=1;
		
		f[0]=1;
		f[1]=1;
		f[2]=1;
		
		d[0]=1;
		d[1]=1;
		d[2]=1;
		
		bo[0]=true;
		bo[1]=true;
		bo[2]=false;
		
		str[0]="p";
		str[1]="p";
		str[2]="p";
		
		for(int p=0;p<b.length;p++) {
			System.out.print(b[p]+" ");
		}
		System.out.println();
		for(int p=0;p<s.length;p++) {
			System.out.print(s[p]+" ");
		}
		System.out.println();
		for(int p=0;p<i.length;p++) {
			System.out.print(i[p]+" ");
		}
		System.out.println();
		for(int p=0;p<l.length;p++) {
			System.out.print(l[p]+" ");
		}
		System.out.println();
		for(int p=0;p<f.length;p++) {
			System.out.print(f[p]+" ");
		}
		System.out.println();
		for(int p=0;p<d.length;p++) {
			System.out.print(d[p]+" ");
		}
		System.out.println();
		for(int p=0;p<bo.length;p++) {
			System.out.print(bo[p]+" ");
		}
		System.out.println();
		for(int p=0;p<str.length;p++) {
			System.out.print(str[p]+" ");
		}

	}

}
