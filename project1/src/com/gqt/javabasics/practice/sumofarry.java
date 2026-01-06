package com.gqt.javabasics.practice;

import java.util.Arrays;
import java.util.Scanner;

public class sumofarry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array= {2,3,4,3,4,5,6,2,5};
		int firstmax=Integer.MAX_VALUE;
		int secondmax=Integer.MAX_VALUE;
		
		for(int value:array) {
			if(value>firstmax) {
				secondmax=firstmax;
				firstmax=value;
			}
			else if(value>secondmax && value!=firstmax) {
				secondmax=value;
			}
		}
		System.out.println("the second largest element is="+secondmax);
	
		}
			}
