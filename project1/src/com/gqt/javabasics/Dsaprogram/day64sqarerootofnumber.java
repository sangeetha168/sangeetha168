package com.gqt.javabasics.Dsaprogram;

public class day64sqarerootofnumber {

	static int sqar(int n) {
		if(n==0||n==1) {
			return n;
		}
		int l=2;
		int h=n/2;
		int res=0;
		while(l<=h) {
			int m=(l+h)/2;
			if(m*m==n) {
				return m;
			}
			else if(m*m<n) {
				l=m+1;
				res=m;
			}
			else {
				h=m-1;
			}
		}
		return res;
	}
	public static void main(String[] args) {

		int n=24;
		System.out.println(sqar(n));
	}

}
