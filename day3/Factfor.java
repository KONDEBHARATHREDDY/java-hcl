package com.hcl.day3;

public class Factfor {
	public void show(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0){
				System.out.println("factor" +i );
			}
		}
	}
	public static void main(String[] args) {
		int n=10;
		new Factfor().show(n);
	}

}
