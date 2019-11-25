package com.hcl.collections;

public class student {
int sno;
String name;
double cgpa;
public student(int sno, String name, double cgpa) {
	super();
	this.sno = sno;
	this.name = name;
	this.cgpa = cgpa;
}
@Override
public String toString() {
	return "student [sno=" + sno + ", name=" + name + ", cgpa=" + cgpa + "]";
}
}
