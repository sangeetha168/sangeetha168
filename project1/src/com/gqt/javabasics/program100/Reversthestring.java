package com.gqt.javabasics.program100;

public class Reversthestring {

	public static void main(String[] args) {
		String original="sangeetha";
		StringBuilder reversed=new StringBuilder();
		
		for(int i=original.length()-1;i>=0;i--) {
			reversed.append(original.charAt(i));
		}
		System.out.println("original="+original);
		System.out.println("reversed="+reversed);
		}
	}


