package com.hcl.generics;

class data<T> {
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value " +a+ "B value" +b);
	}
}

public class gendemo {
public static void main(String[] args) {
	data obj1=new data();
	int a=5,b=7;
	obj1.swap(a, b);
	double a1=12.5,b1=5.7;
	String s1="bharath",s2="lokesh";
	obj1.swap(s1, s2);
	boolean f1=true,f2=false;
	obj1.swap(f1, f2);
}
}
