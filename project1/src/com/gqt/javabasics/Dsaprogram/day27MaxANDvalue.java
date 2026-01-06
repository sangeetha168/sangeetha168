package com.gqt.javabasics.Dsaprogram;

public class day27MaxANDvalue {
	
	static int checkbits(int[] arr,int mask) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if((mask & arr[i])==mask) {
				count++;
			}
		}
		return count;
	}
	static int maxANDvalue(int[] arr) {
		int result=0;
		int mask=0;
		for(int i=31;i>=0;i++) {
			mask=(1<<i)|result;
			int count=checkbits(arr,mask);
			if(count>=2) {
				result=mask;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr= {16,9,6,13};
		System.out.println(maxANDvalue(arr));
	}

}
