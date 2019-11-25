package com.hcl.day3;

public class Fact {
	
	public void number() {
		int fact=1,i=1,n=5;
		
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial" +fact);
	}
	public static void main(String[] args) {
		Fact obj=new Fact();
		obj.number();
		
	}

}
