package com.gqt.javabasics.program100;

public class shiftele {

	public static void main(String[] args) {
		int[] array= {2,3,4,5,6};
		int n=1;
		for(int i=0;i<n;i++) {
			int last=array[array.length-1];
			for(int j=array.length-1;j>0;j--) {
				array[j]=array[j-1];
			}
			array[0]=last;
		}
		System.out.println("array after shifting to right");
		for(int value:array) {
			System.out.print(value);
		}
	}

}
