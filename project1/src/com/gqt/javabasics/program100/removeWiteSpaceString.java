package com.gqt.javabasics.program100;

public class removeWiteSpaceString {

	public static void main(String[] args) {
		String withSpace=" hello world ";
		String withoutspace=withSpace.replaceAll("\\s","");
		
		System.out.println("withSpace="+withSpace);
		System.out.println("withoutSpace="+withoutspace);
	}

}
