package com.hcl.generics;

import java.util.ArrayList;
import java.util.List;

public class genemploy {

	public static void main(String[] args) {
		List<employ> employ=new ArrayList<employ>();
		employ.add(new employ(1,"bharath",66666));
		employ.add(new employ(2,"lokesh",77777));
		employ.add(new employ(3,"kranthi",88888));
		for (employ emp : employ) {
			System.out.println(emp);
		}
	}
	
}
