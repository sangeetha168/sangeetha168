package com.gqt.javabasics.Dsaprogram;

import java.util.Scanner;

public class day14BITManupulation {
	static String decimalToBinary(int n) {
		String b="";
		while(n>=1) {
			int x=n%2;
			n=n/2;
			b=x+b;
		}
		return b;
		
	}
	static void binaryTodecimal(String b) {
		int result =0;
		int powerof=1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
//		System.out.println(2&3);
//		System.out.println(2|3);
//		System.out.println(2^3);
//		System.out.println(2>>1);//right shift
//		System.out.println(3<<4);//signed left shift
//		System.out.println(6>>>1);//unsigned
		System.out.println(decimalToBinary(n));
	}
}
