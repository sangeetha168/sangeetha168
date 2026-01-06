package com.gqt.javabasics.twoClass;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		 if(i%2==0&&i%3==0) {
				System.out.println("fizz buzz");			}
			else if(i%2==0) {
				System.out.println("buzz");
			}
			else if(i%3==0) {
				System.out.println("fizz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
