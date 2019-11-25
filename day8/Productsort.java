package com.hcl.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hcl.day8.Product;

public class Productsort {


	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"samsung A5",17000));
		list.add(new Product(2,"Iphone 6S",65000));
		list.add(new Product(3,"Sony Xperia",25000));
		list.add(new Product(4,"Nokia Lumia",15000));
		Collections.sort(list,(p1,p2)-> {
			return p1.name.compareTo(p2.name);
		});
		list.forEach(p-> {
			System.out.println(p);
		});
		Collections.sort((List(p1,p2)-> {
		if(p1.price>=p2.price) {
			return 1;}
		else {
			return -1;
			
		}
			
	});
}
}