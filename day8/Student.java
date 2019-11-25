package com.hcl.day8;

public class Student implements Comparable<Student> {

	int sno;
	String name;
	String city;
	double cgpa;
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgpa=" + cgpa + "]";
	}
	public Student(int sno, String name, String city, double cgpa) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgpa = cgpa;
	}
	@Override
	public int compareTo(Student s) {
		
		return this.name.compareTo(s.name);
	}
	
}
