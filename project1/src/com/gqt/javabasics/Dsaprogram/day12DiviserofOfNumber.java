package com.gqt.javabasics.Dsaprogram;
import java.util.Scanner;
public class day12DiviserofOfNumber {
	static void divise(int n) {
		int i=0;
		for(i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				
		}
		}
		for(;i>=1;i--) {
			if(n%i==0 && i!=n/i) {
				System.out.println(n/i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		divise(n);
	}
}
//int n=sc.nextInt();
//for(int i=1;i<=n;i++) {
//	if(n%i==0) {
//		System.out.println(i);
//	}
//}
//static void diviser(int n) {
//	int i=0;
//	for(i=1;i*i<=n;i++) {
//		if(n%i==0) {
//			System.out.println(i);
//		}
//	}
//	for(;i*i>=1;i--) {
//		if(n%i==0&&i!=n/i) {
//			System.out.println(n/i);
//		}
//	}
//}