package com.hcl.day3;

public class Ctof {
	
	public void calc(double c) {
		double f=((9*c)/5)+32;
		System.out.println("Fahrenheit value " +f);
	}
	public static void main(String[] args) {
		double c=37;
		Ctof obj=new Ctof();
		obj.calc(c);
		
	}

}
