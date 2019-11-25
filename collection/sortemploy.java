package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortemploy {

	public static void main(String[] args) {
		Comparator c=new basicComparator();
		SortedSet s=new TreeSet(c);
		s.add(new employ(1,"bharath",66666));
		s.add(new employ(2,"lokesh",77777));
		s.add(new employ(3,"kranthi",88888));
		for (Object ob : s) {
			employ e=(employ)ob;
			System.out.println(e);
		}
	}
	
	
}
