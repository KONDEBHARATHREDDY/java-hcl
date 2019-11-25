package com.hcl.collections;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class setdemo {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("bharath");
		s.add("lokesh");
		s.add("kranthi");
		s.add("babloo");
		s.add("munaa");
		s.add("chinna");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
	
}
