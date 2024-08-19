package com.acc;

public class PublicAcc extends B {

	public static void main(String[] args) {
		PublicAcc p= new PublicAcc();
		int output=p.x;
		System.out.println("Value of x is: "+ output);
		p.b1();
	}

}
