package com.gqt.javabasics.program100;

import java.util.Scanner;

public class checkovelandCon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=str.toUpperCase();
		int vowel=0;
		int consonent=0;
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				vowel++;
			}
			else {
				consonent++;
			}
			
		}
	}
		System.out.println("vowelcount"+vowel);
		System.out.println("consonent count"+consonent);
	}}
