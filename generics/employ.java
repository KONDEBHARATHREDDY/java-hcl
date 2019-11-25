package com.hcl.generics;

public class employ {

	int empno;
	String name;
	double basic;
	public employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	
}
