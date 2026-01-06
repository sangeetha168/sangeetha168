package com.gqt.javabasics.Dsaprogram;

public class day65removeduplicateelementinanarray {

	static int removeduplicate(int[] ar) {
		int rd=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[rd]!=ar[i]) {
				rd++;
				ar[rd]=ar[i];
			}
		}
		return rd+1;
	}
	public static void main(String[] args) {

		int[] ar= {2,2,3,3,4,5};
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
	int  rd=removeduplicate(ar);
	        
		for(int i=0;i<rd;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
