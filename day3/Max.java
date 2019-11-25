package com.hcl.day3;

public class Max {
	
	public void check(int a, int b,int c) {
		if(a>b && a>c){
			System.out.println(" "+a);
		}
		else if(a<b && b>c){
			System.out.println(" "+b);
		}
		else{
			System.out.println(" "+c);
		}
		
	}
	public static void main(String[] args) {
		int a,b,c;
		a=5;
		b=7;
		c=3;
		Max obj=new Max();
		obj.check(a, b, c);
		
	}

}
