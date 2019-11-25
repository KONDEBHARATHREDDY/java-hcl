package com.hcl.collections;

import java.util.Comparator;

public class cgpacomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		sortstudent s1=(sortstudent)o1;
		sortstudent s2=(sortstudent)o2;
		if(s1.cgpa >= s2.cgpa) {
			return 1;
		} else {
			
		return -1;
	}

}}
