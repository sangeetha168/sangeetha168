package com.gqt.javabasics.program100;

import java.util.Scanner;

public class ReplacewithSpecialchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toUpperCase();
		String temp="";
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				temp=temp+'@';
			}
			else {
				temp=temp+str.charAt(i);
			}

		}
	}
		System.out.println("the string replace with special character="+temp);

}}