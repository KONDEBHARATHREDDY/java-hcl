package com.hcl.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapdemo {

	public static void main(String[] args) {
		Map names=new HashMap();
		names.put("1","bharath");
		names.put("2","mouni");
		names.put("3", "lokesh");
		names.put("4", "kranthi");
	names.put("5", "babloo");
	String key,value;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter key ");
	key=sc.nextLine();
	value=(String)names.getOrDefault(key, "not found");
	System.out.println(value);
	}
	
}
