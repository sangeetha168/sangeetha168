package com.gqt.javabasics.Dsaprogram;

import java.util.Scanner;

public class day23SwaptheEvenOdd {

	static int swapnumber(int n) {
		return ((n& 0xaaaaaaaa)>>>1)|((n& 0x55555555)<<1);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(swapnumber(n));
		

	}

}
