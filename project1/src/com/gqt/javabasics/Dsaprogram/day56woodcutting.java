package com.gqt.javabasics.Dsaprogram;

public class day56woodcutting {

	static int findwoodcount(int[] ht,int mid) {
		int wc=0;
		for(int i=0;i<ht.length;i++) {
			if(ht[i]>mid) {
				wc=wc+(ht[i]-mid);
				//     20-15=5 that is go to wc then again
				// second element is 15-15=0 it will added to wc
				//then it continue till the elements
			}
		}
		return wc;
	}
	static int machineheight(int[] ht,int b) {
		int max=0;
		for(int i=0;i<ht.length;i++) {
		if(ht[i]>max) {
			max=ht[i];
		}	
		}
		int l=0;
		int h=max;
		int mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			int wc=findwoodcount(ht,mid);
		
			if(wc==b||l==mid) {
				return mid;
			}
			else if(wc>b) {
				l=mid;
			}
			else {
				h=mid;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {

		int[] ht= {20,15,10,17};
		int b=7;
		System.out.println(machineheight(ht,b));
	}

}
