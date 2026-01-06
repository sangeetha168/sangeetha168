package com.gqt.javabasics.dsa;

import java.util.Scanner;

public class countDigite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
			
		N=Math.abs(N);
		if(N==0) {
			System.out.println("number of digit:1");
		}
		else {
			int count=0;
			while(N>0) {
				N=N/10;
				count++;
			}
			System.out.println("the total number of digit="+count);
		}
	}

}
