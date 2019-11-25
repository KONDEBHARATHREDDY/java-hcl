package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class arrlistdemo {

	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("bharath");
		names.add("lokesh");
		names.add("kranthi");
		names.add("vinay");
		names.add("babloo");
		System.out.println("names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add("yashu");
		System.out.println("names afteradding");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(3,"prudhvi");
		System.out.println("names after editing");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("bharath");
		System.out.println("list after removing");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove(0);
		System.out.println("list after removing");
		for (Object ob : names) {
			System.out.println(ob);
		}
		}
	
}
