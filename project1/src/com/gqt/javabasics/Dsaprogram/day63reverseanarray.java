package com.gqt.javabasics.Dsaprogram;

public class day63reverseanarray {

	static void reverse(int[] ar) {
		int i=0;
		int j=ar.length-1;
		while(i<j) {
			int t=ar[i];
			ar[i]=ar[j];
			ar[j]=t;
			i++;
			j--;
		}
			
			
	}
	public static void main(String[] args) {

		int[] ar= {2,3,4,5,6,7};
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		reverse(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		
	}
	}
}
