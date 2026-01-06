package com.gqt.javabasics.Dsaprogram;

public class day62sortedOrnot {

	static boolean checkanarraysortedornot(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>=ar[i-1]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {

		int ar[]= {2,4,6,7,9,45,67,80};
		System.out.println(checkanarraysortedornot(ar));
	}

}
