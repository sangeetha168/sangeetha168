package com.gqt.javabasics.program100;

public class checkthearraysorted {
	public static void main(String[] args) {
		int[] array= {2,5,7,35,4,2};
		boolean sorted=true;
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1]) {
				sorted=false;
				break;
			}
		}
			if(sorted) {
				System.out.println("the given array is sorted in asending order");
			}
			else {
				System.out.println("the given array is not sorted in asending order");
			}
		}
	}
