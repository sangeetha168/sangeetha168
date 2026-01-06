package com.gqt.javabasics.twoClass;

public class sortarray {

	public static void main(String[] args) {
		int[] array= {20,38,46,2,464,56};
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		for(Integer i:array) {
			System.out.print(i+" ");
		
		
		}
		System.out.println();
		int highest=array[array.length-1];
		int lowest=array[0];
		System.out.println("highest="+highest);
		System.out.println("lowest="+lowest);
	}
}
