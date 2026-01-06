package com.gqt.javabasics.Dsaprogram;

public class Ceil {
	static int ceil(int[] a,int key) {
		int l=0;
		int h=a.length-1;
		int mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==a[mid]) {
				return a[mid];
			}
			else if(key<a[mid]) {
				h=mid-1;
				l=l;
			}
			else {
				l=mid+1;
				h=h;
			}
		}
		return a[l];	
	}
	
	public static void main(String[] args) {
		int[] a= {10,35,465,65};
		int key=75;
		System.out.println(ceil(a, key));
	}

}
