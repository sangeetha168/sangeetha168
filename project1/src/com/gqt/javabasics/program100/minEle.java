package com.gqt.javabasics.program100;

public class minEle {

	public static void main(String[] args) {
		 int[] array={1,2,3,4,5};
	        int min=array[0];
	        for (int i=1;i<array.length;i++){
	            if(array[i]<min)
	            min=array[i];
	        }
	        System.out.println("the max element in an array="
	        +min);
	        

	}

}
