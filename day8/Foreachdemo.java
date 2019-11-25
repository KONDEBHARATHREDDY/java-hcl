package com.hcl.day8;

import java.util.ArrayList;
import java.util.List;

public class Foreachdemo {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("bharath");
		names.add("lokesh");
		names.add("kranthi");
		names.forEach(n -> {
			System.out.println(n);
		});
		List<Integer> num=new ArrayList<Integer>();
		num.add(new Integer(67));
		num.add(new Integer(11));
		num.add(new Integer(79));
		num.forEach(p -> {
			if(p>50) {
				System.out.println(p);
				
			}
		});
	}
	
}
