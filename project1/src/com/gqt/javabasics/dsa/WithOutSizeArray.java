package com.gqt.javabasics.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class WithOutSizeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String nums[]=str.split(" ");
		ArrayList<Integer> list=new ArrayList<>();
		
		for(String num:nums) {
			list.add(Integer.parseInt(num));
		}
		for(int ele:list) {
			System.out.println(ele+ " ");
		}
	}

}
