package com.gqt.javabasics.program100;

import java.util.HashSet;
import java.util.Set;

public class checkDuplicateEle {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,2};
		Set<Integer> uniqueSet=new HashSet<>();
		boolean containsDuplicate=false;
		
		for(int value:arr) {
			if(!uniqueSet.add(value)) {
				containsDuplicate =true;
				break;
			}
		}
		if(containsDuplicate) {
			System.out.println("contains duplicate");
		}
		else {
			System.out.println("not conttains duplicate");
		}
	}
	

}
