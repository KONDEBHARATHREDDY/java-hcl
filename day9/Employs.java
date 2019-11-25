package com.hcl.day9;

public class Employs {

	int empno;
	String name;
	String city;
	String design;
	double basic;
	public Employs(int empno, String name, String city, String design, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.city = city;
		this.design = design;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", city=" + city + ", design=" + design + ", basic="
				+ basic + "]";
	}
	
}
