package com.gqt.javabasics.datatypes;

import java.util.Scanner;

public class arr1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no of student");
		int n=sc.nextInt();
		int arr[]=new int[n];
		//collecting the marks of student
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the marks of the student no"+(i+1));
			arr[i]=sc.nextInt();
		}
		//display marks of student
		for(int i=0;i<arr.length;i++) {
			System.out.println("marks of the student no "+(i+1)+"is"+arr[i]);
		}
	}

}
