package com.gqt.javabasics.Oops;

class carservece{

	private int CustomerId;
	String Customername;
	private String customerphonenumber;
	String CustAddress;

	void setdata() {
		CustomerId=100;
		customerphonenumber="9740587961";
		CustAddress="pune";
		Customername="sangeetha";
	}
	void getdata() {
		System.out.println(CustomerId);
		System.out.println(customerphonenumber);
		System.out.println(CustAddress);
		System.out.println(Customername);

	}
}
public class Encapsulation {

	public static void main(String[] args) {
		carservece c1=new carservece();
		System.out.println(c1.Customername="supritha");
		c1.setdata();
		c1.getdata();

	}

}
