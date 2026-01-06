package com.gqt.javabasics.datatypes;

import java.util.Scanner;

public class arr2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of class room");
		int cls=sc.nextInt();
		System.out.println("enter the number of student in each class");
		int stu=sc.nextInt();
		String arr[][]=new String[cls][stu];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the class room no"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the student name");
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the class room no"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" the student name no:"+(j+1)+" is: "+(arr[i][j]));
			
			}
		}
			}
		}
	


