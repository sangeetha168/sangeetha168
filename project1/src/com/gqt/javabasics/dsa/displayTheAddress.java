package com.gqt.javabasics.dsa;

import java.util.Scanner;

public class displayTheAddress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String customername=sc.next();
		long mobilenumber=sc.nextLong();
		String Address=sc.next();
		int items=sc.nextInt();
		float cost=sc.nextFloat();
		
		System.out.println("customername="+customername);
		System.out.println("mobilenumber="+mobilenumber);
		System.out.println("address="+Address);
		System.out.println("total bill="+(items*cost));
	}

}
