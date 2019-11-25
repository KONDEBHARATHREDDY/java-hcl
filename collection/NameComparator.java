package com.hcl.collections;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		employ e1=(employ)o1;
		employ e2=(employ)o2;
		return e2.name.compareTo(e1.name);
	}

}
