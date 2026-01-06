package com.gqt.javabasics.dsa;

import java.util.Scanner;

public class shortarr {

	public static void main(String[] args) {
		int arr[]= {3,0,65,746,78,45};
		Scanner sc=new Scanner(System.in);
		int temp=0;
		int highest=0;
		int lowest=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		highest=arr[arr.length-1];
		lowest=arr[0];
		System.out.println("higest="+highest);
		System.out.println("lowest="+lowest);
		System.out.println("shorted array is=");
		for(Integer i:arr) {
			System.out.println(i+" ");
				}
			}
}
