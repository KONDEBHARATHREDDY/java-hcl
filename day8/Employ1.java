package com.hcl.day8;

import java.util.SortedSet;
import java.util.TreeSet;

public class Employ1 {
public static void main(String[] args) {
	SortedSet<Employ> employs=new TreeSet<Employ>();
	employs.add(new Employ(1,"bharath","software","engineer",80000));
	employs.add(new Employ(2,"lokesh","software","engineer",90000));
	employs.add(new Employ(3,"kranthi","software","engineer",100000));
	for (Employ employ : employs) {
		System.out.println(employ);
		
	}
}
}
