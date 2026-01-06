package com.gqt.javabasics.Dsaprogram;

public class day59minimumtimetakenformakebouques {
	private static boolean ispossible(int[] ar, int boq, int flowers, int m) {
		int adj=0;
		int bc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<=m) {
				adj++;
				if(adj==flowers) {
					bc++;
					if(bc==boq) {
						return true;
					}
					adj=0;
				}
			}
			else {
				adj=0;
			}
		}
		
		return false;
	}
	static int mindaymakebouques(int[] ar,int flowers,int boq) {
		if(boq*flowers>ar.length) {
			return -1;
		}
		int l=ar[0];//==2
		int h=ar[0];//==10 so mid==6
		for(int i=0;i<ar.length;i++) {
		if(ar[i]<l) {
			l=ar[i];//gives lowest value is 2
		}
		if(ar[i]>h) {
			h=ar[i];//gives highest value is 10
		}
		}
		int res=-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(ispossible(ar,boq,flowers,m)==true) {
			res=m;
			h=m-1;
			}
			else {
			l=m+1;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {

		int [] ar= {2,5,2,9,3,5,7,9,10,4,5,6};
		int boq=4;
		int flowers=2;
		System.out.println(mindaymakebouques(ar,boq,flowers));
 	}

}
