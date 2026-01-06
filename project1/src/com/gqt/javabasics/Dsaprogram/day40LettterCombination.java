package com.gqt.javabasics.Dsaprogram;

import java.util.Scanner;

public class day40LettterCombination {
	static String[] keypad= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static void posiblewords(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		String key=keypad[s.charAt(0)-48];
		for(int i=0;i<key.length();i++) {
			posiblewords(s.substring(1),ans+key.charAt(i));
		}
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			posiblewords(s,"");

		}

	}
