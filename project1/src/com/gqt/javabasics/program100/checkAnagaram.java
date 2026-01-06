package com.gqt.javabasics.program100;

import java.util.Arrays;

public class checkAnagaram {

	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		//convert the string to array
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		//sort the converted array
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean anagram=Arrays.equals(arr1, arr2);
		if(anagram) {
			System.out.println("the given two string are anagram");
		}
		else {
			System.out.println("the given two string are  not an anagram");
		}
	}

}
