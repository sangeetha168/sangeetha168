package com.gqt.javabasics.datatypes;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the size of the number");
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
		 System.out.print("*");
		 }
			 System.out.println();
	}

}
}
