package com.gqt.javabasics.program100;

public class converStringtoInteger {

	public static void main(String[] args) {
		String str="123";
		int num=0;
		for(char c:str.toCharArray()) {
			num=num*10+(c-'0');
		}
		System.out.println(num);
	}
}
