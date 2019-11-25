package com.hcl.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;



public class Reademploy {
 public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("c:/files/d1.txt");
		DataInputStream din=new DataInputStream(fin);
		
		
		System.out.println(employ);
		
			
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
