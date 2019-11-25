package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortstudent1 {
public static void main(String[] args) {
	Comparator c=new namecomparator();
	SortedSet s=new TreeSet();
	s.add(new sortstudent(1,"bharath",5.6));
	s.add(new sortstudent(2,"lokesh",9.3));
	s.add(new sortstudent(3,"kranthi",9.5));
	for (Object ob : s) {
		sortstudent e=(sortstudent)ob;
		System.out.println(s);
	}
}
}
