package com.gqt.javabasics.Oops;

class calculator{
	int add(int a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
}
public class Overlodding {

	public static void main(String[] args) {
		calculator c1=new calculator();
		int a=10,b=30,c=60;
		float m=10.5f,n=20.6f,o=40.6f;
		double p=676.9,q=6868.980,r=79.9;
		System.out.println(c1.add(a, b));
		System.out.println(c1.add(m, n));
		System.out.println(c1.add(a, q));

	}

}
