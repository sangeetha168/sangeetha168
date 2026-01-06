package com.gqt.javabasics.program100;

public class averageofele {

	public static void main(String[] args) {
		int[] array={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
            double avg=(double)sum/array.length;
            
        
        System.out.println("the avg element in the given array is="+avg);
	}

}
