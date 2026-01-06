package com.gqt.javabasics.Dsaprogram;

public class day42cuttingRofe {


	static int maxpice(int n,int a,int b,int c) {
		if(n==0) {
			return 0;
		}
		else if(n<0) {
			return -1;
		}
		int temp=maxpice(n-a,a,b,c);
		int temp1=maxpice(n-b,a,b,c);
		int temp2=maxpice(n-c,a,b,c);
		int pices=Math.max(temp,Math.max(temp1, temp2));
		if(pices==-1) {
			return -1;
			
		}
			return pices+1;
	}
	
	public static void main(String[] args) {
		System.out.println(maxpice(15,5,8,7));

	}

}
