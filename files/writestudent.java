package com.hcl.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class writestudent {

	public static void main(String[] args) {
	
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/d1.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
