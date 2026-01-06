package com.gqt.javabasics.Dsaprogram;

import java.util.Scanner;

public class day35To40 {

	static boolean ispalindrome(String s,int i,int j) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		if(j<=i) {
			return true;
		}
			return ispalindrome(s, i+1,j-1);
		}
	static int sum(int[] ar,int i) {
		if(i==ar.length) {
			return 0;
		}
		return sum(ar,i+1)+ar[i];
	}
	static int jos(int n,int k) {
		if(n==1) {
			return 0;
		}
		return (jos((n-1),k)+k)%n;
	}
	static void balparanth(char[] ar, int n, int i, int o, int c) {
	    if (i == ar.length) { // Base case: full string built
	        System.out.println(new String(ar));
	        return;
	    }
	    if (o < n) { // Can place '('
	        ar[i] = '(';
	        balparanth(ar, n, i + 1, o + 1, c);
	    }
	    if (c < o) { // Can place ')'
	        ar[i] = ')';
	        balparanth(ar, n, i + 1, o, c + 1);
	    }
	}
	static void subString(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		//pick
		subString(s.substring(1),ans+s.charAt(0));
		//not pick
		subString(s.substring(1),ans);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(ispalindrome(s,0,s.length()-1));
		int[] ar= {2,3,4};
		System.out.println(sum(ar, 0));
		//int n=sc.nextInt();
		//int k=sc.nextInt();
		//System.out.println(jos(n,k));
		//char[] ar=new char[n*2];
		//balparanth(ar,n,0,0,0);
		//String s=sc.next();
		subString(s,"");
		}
}
