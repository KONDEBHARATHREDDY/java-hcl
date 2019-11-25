package com.hcl.day9;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<String> names=new Stack<String>();
		names.push("bharath");
		names.push("lokesh");
		names.push("kranthi");
		for (String string : names) {
			System.out.println(string);
		}
	}
	
}
