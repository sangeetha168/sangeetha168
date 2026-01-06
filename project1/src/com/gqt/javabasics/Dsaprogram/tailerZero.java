package com.gqt.javabasics.Dsaprogram;

import java.util.Scanner;

public class tailerZero {
	static int tailer(int n) {
		int res=0;
		int powerof5=5;
		
		while(n>=powerof5) {
			res=res+(n/powerof5);
			powerof5=powerof5*5;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(tailer(n));
	}
}
