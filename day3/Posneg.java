package com.hcl.day3;

public class Posneg {
	
	public void check(int n) {
		if(n>=0) {
			System.out.println("positive no...");
		} else {
			System.out.println("Negative no...");	
			}
	}
	public static void main(String[] args) {
		int n=5;
		Posneg obj=new Posneg();
		obj.check(n);
	
	}

}
