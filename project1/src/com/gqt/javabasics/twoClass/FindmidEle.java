package com.gqt.javabasics.twoClass;

import java.util.Scanner;

public class FindmidEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int mid=n/2;
		if(n%2==1) {
			System.out.println(arr[mid]);
		}
		else {
			int sum=0;
			sum+=arr[mid-1]+arr[mid];
			int avg=(sum)/2;
			System.out.println(avg);
		}
	}

}
