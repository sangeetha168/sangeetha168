package com.gqt.javabasics.program100;

import java.util.Scanner;

public class chechPalindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String Str_temp="";
		for(int i=str.length()-1;i>=0;i--) {
			Str_temp=Str_temp+str.charAt(i);
		}
		if(str.equals(Str_temp)==true) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}

}
