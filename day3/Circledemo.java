package com.hcl.day3;

public class Circledemo {

	public void calc(double radius) {
		double area,circ;
		area=Math.PI * Math.pow(radius, 2);
		circ=2*Math.PI*radius;
		System.out.println("Area of circle " +area);
		System.out.println("circumference " +circ);
	}
	public static void main(String[] args) {
		double radius=12.5;
		Circledemo obj=new Circledemo();
		obj.calc(radius);
	}
}
