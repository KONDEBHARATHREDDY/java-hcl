package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("C:/javatraining/day3/Demoproject/src/com/hcl/files/Filecopy.java");
		int ch;
		while((ch=fin.read()) !=-1) {
			System.out.print((char)ch);
		}
	fin.close();	
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}

}
