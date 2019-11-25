package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class arremp {

	public static void main(String[] args) {
		List emp=new ArrayList();
		emp.add(new employ(1,"bharath",66666));
		emp.add(new employ(2,"lokesh",77777));
		emp.add(new employ(3,"kranthi",88888));
		for (Object ob : emp) {
			employ e=(employ)ob;
			System.out.println(e);
		}

		
	}
	
}
