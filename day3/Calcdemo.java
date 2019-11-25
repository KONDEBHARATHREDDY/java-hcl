package com.hcl.day3;

public class Calcdemo {
	
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("sum is " +c);
	}
	public static void main(String[] args) {
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		Calcdemo obj=new Calcdemo();
		obj.sum(a, b);
	}

}
