package com.hcl.hashmap;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Mapdemo1 {



	public static void main(String[] args) {
		Map<String, Double> m=new Hashtable<String,Double>();
		m.put("lokesh", 666666.6);
		m.put("bharath", 77777.7);
		m.put("kranthi", 88888.8);
		m.put("babloo", 99999.9);
		String key;
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key");
	key=sc.nextLine();
	sal=m.getOrDefault(key, 0.0);
	System.out.println("salary is " +sal);
	}
	
}
