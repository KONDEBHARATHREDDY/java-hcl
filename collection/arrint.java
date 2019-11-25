package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class arrint {
public static void main(String[] args) {
	List num=new ArrayList();
	num.add(new Integer(56));
	num.add(new Integer(78));
	num.add(new Integer(42));
	num.add(new Integer(13));
	System.out.println("number are");
	for (Object ob : num) {
		System.out.println(ob);
	}
	int sum=0;
	for (Object ob : num) {
		sum+=(Integer)ob;
		
	}
	System.out.println("sum is " +sum);
}
}
