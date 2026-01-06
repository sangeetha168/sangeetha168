package com.gqt.javabasics.Dsaprogram;

import java.util.Scanner;

public class day29to34 {

	static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	static int fibonoci(int n) {
		if(n==1||n==2) {
			return 1;
		}
		return fibonoci(n-1)+fibonoci(n-2);
	}
	static void printNaturalNu(int n) {
		if(n==0) {
			return;
		}
		printNaturalNu(n-1);//if we reverse this we get the reverse order of natural number
		System.out.println(n);
	}
		static int countnumber(int n) {
			if(n==0) {
				return 0;
			}
			return countnumber(n/10)+1;
		}
		static int sumofnumber(int n) {
			if(n==0) {
				return 0;
			}
			return sumofnumber(n/10)+(n%10);
		}
		static String reverseString(String s,String r,int i) {
			if(i<0) {
				return r;
			}
			return reverseString(s,r+s.charAt(i),i-1);
		}
	public static void main(String[] args) {
		int n=5;
		Scanner sc=new Scanner(System.in);
		System.out.println(factorial(n));//6
	//System.out.println(fibonoci(10));//13
printNaturalNu(100);
//		System.out.println(countnumber(1132));//4
	System.out.println(sumofnumber(555));//15
	 String s=sc.next();
System.out.println(reverseString(s,"",s.length()-1));
	}

}
