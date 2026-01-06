package com.gqt.javabasics.program100;

import java.util.Arrays;

public class removeduplicate {

	public static void main(String[] args) {
		int[] array= {2,2,3,4,5,6,6};
		System.out.println(" the duplicate elements");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println(array[j]);
				}
			}
		}
	}

}
