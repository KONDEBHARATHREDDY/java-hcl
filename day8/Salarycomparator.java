package com.hcl.day8;

import java.util.Comparator;

public class Salarycomparator implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		if(o1.salary>=o2.salary) {
			return 1;
		}
		
		else {
			return -1;
		}
		}
	}
