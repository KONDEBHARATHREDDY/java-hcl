package com.hcl.collections;

public class sortstudent {

	int sno;
	String name;
	double cgpa;
	public sortstudent(int sno, String name, double cgpa) {
		super();
		this.sno = sno;
		this.name = name;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "sortstudent [sno=" + sno + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	
	
}
