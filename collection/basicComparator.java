package com.hcl.collections;

import java.util.Comparator;

public class basicComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		employ e1=(employ)o1;
		employ e2=(employ)o2;
		if(e1.basic >= e2.basic) {
		return 1;
		}
	 else {
		return -1;
	}

}}
