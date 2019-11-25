package com.hcl.files;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class REadstudent {
	
public static void main(String[] args) {
	try {
		FileInputStream fir=new FileInputStream("c:/files/d1.txt");
		ObjectInputStream objin=new ObjectInputStream(fir);
		Student student=(Student)objin.readObject();
		objin.close();
		fir.close();
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
