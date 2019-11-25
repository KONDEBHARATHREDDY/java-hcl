package com.hcl.files;

public class Student {
int sno;
String name;
double cgpa;
public Student(int sno, String name, double cgpa) {
	super();
	this.sno = sno;
	this.name = name;
	this.cgpa = cgpa;
}
@Override
public String toString() {
	return "Student [sno=" + sno + ", name=" + name + ", cgpa=" + cgpa + "]";
}
}
