package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortdemo {
 
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add("bharath");
		s.add("kranthi");
		s.add("munna");
		s.add("babloo");
		s.add("lokesh");
		s.add("yashu");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
	
}
