package com.gqt.javabasics.dsa;

import java.util.Scanner;

public class DivideandMultilpyUsingBitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int multiple=number<<1;
		float divistion=number>>1;
		System.out.println(+multiple+","+divistion);
		
	}

}
