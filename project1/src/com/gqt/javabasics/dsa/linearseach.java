package com.gqt.javabasics.dsa;

import java.util.Scanner;

public class linearseach {

	public static void main(String[] args) {
		int arr[]= {20,40,50,60,70,80};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key element");
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				System.out.println("the key found at the position="+i);
				System.exit(0);
		}
		
		}
		System.out.println("key not found");
			}
			
		
	}


