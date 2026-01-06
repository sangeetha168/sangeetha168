package com.gqt.javabasics.Dsaprogram;

import java.util.Scanner;

public class Factorial {

	
	static long fact(int n) {
		long res=1;
		for(int i=1;i<=n;i++) {
			res*=i;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
}
