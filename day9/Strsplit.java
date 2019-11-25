package com.hcl.day9;

public class Strsplit {

	void show() {
		String names="bharath lokesh kranthi babloo vinay";
		String[] list=names.split(" ");
		for (String string : list) {
			System.out.println(string);
		}
	
		
	}
	public static void main(String[] args) {
		new Strsplit().show();
	}
}
