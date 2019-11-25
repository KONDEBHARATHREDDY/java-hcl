package com.hcl.day8;

import java.util.ArrayList;
import java.util.List;

public class Lambdaproduct {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"samsung A5",17000));
		list.add(new Product(2,"Iphone 6S",65000));
		list.add(new Product(3,"Sony Xperia",25000));
		list.add(new Product(4,"Nokia Lumia",15000));
		list.stream().filter(p -> p.price <=20000).forEach(x-> {
			System.out.println(x);
		});
		list.stream().filter(n->n.name.startsWith("s")).forEach(x-> {
			System.out.println(x);
		});
		System.out.println("Max Price Mobile \n-----");
		
		Product maxProduct=list.stream().max((p1,p2)->p1.price >=p2.price ? 1:-1).get();
		System.out.println(maxProduct);
		{
		System.out.println("min price Mobile-----");
		Product minProduct=list.stream().min((p1,p2)->p1.price>=p2.price ? 1:-1).get();
		System.out.println(minProduct);
				}
		System.out.println("fiest 3 records");
		list.stream().limit(3).forEach(p -> {
			System.out.println(p);
		});
		System.out.println("after skipping 2 records");
		list.stream().skip(2).forEach(p-> {
			System.out.println(p);
		});
	}
}
