package com.hcl.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateex2 {
public static void main(String[] args) {
	
	String doj="15/05/1998";
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	try {
		Date dt=sdf.parse(doj);
		System.out.println(dt);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
