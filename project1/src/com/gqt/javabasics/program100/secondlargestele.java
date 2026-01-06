package com.gqt.javabasics.program100;

public class secondlargestele {

	public static void main(String[] args) {
		int[] array= {1,2,3,8,5,6,67}; 
		
		int firstmax=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		
		for(int value:array) {
			if(value>firstmax) {
				secondmax=firstmax;
				firstmax=value;
			}
			else if(value>secondmax && value!=firstmax) {
				secondmax=value;
			}
		}
		System.out.println("the second largest element is="+secondmax);
	}

}
