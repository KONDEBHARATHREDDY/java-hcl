package com.hcl.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter name bharath");
	try {
		String name=br.readLine();
		System.out.println("name is bharath "+name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
	}
	
	
}
}
