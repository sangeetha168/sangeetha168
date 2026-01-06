package com.gqt.javabasics.Dsaprogram;

import java.util.Scanner;

public class day13findPrimeFac {
	static void fact(int n) {
		int i=2;
		if(i*i<=n) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;//40/2=20,20/2=10,10/2=5,5/5=1
				//so 2,2,2,5
			}
			i++;
			if(n>i) {
				System.out.println(n);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fact(n);
		

	}

}
