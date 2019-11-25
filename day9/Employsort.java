package com.hcl.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hcl.day8.Employ;

public class Employsort {

	public static void main(String[] args) {
		List<Employ>list=new ArrayList<Employ>();
		list.add(new Employ(1,"bharath","software","engineer",80000));
		list.add(new Employ(2,"lokesh","software","engineer",90000));
		list.add(new Employ(3,"kranthi","software","engineer",100000));
	System.out.println("sort name wise");
	Collections.sort(list,(p1,p2)->{
	return p1.name.compareTo(p2.name);
	});
	list.forEach(p-> {
		System.out.println(p);
	});
	e.stream().filter(h->h.dep.startsWith("java")).forEach(m-> {
		System.out.println(m);
	});
	}
	
}
