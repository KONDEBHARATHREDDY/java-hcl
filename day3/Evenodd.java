package com.hcl.day3;

public class Evenodd {
	public void check(int n)
	{
		if(n%2==0) {
			System.out.println("even no..");
		}
		else {
			System.out.println("odd no");
		}
	}
	public static void main(String[] args) {
		int n=5;
		Evenodd obj=new Evenodd();
		obj.check(n);
	}

}
