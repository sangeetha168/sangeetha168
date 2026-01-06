package com.gqt.javabasics.Dsaprogram;

public class day17SwitchONorOF {

	static void switchon(int n) {
		
	}
	public static void main(String[] args) {
		int n=36;
		int i=5;
		int onmask=1<<i;
		int ofmask=~(1<<i);
		System.out.println(n|onmask);
		System.out.println(n&ofmask);
		
		//if we want to ckeck that the ith bit is on off
		if((n & onmask)==0) {
			System.out.println("off");
		}
			else {
				System.out.println("on");
			}
			
		}
	}


