package com.hcl.day8;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortstudent {

	public static void main(String[] args) {
		SortedSet<Student> students=new TreeSet<Student>();
		students.add(new Student(1,"bharath","tirupati",9.7));
		students.add(new Student(2,"lokesh","tirupati",9.3));
		students.add(new Student(3,"kranthi","tirupathi",9.3));
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}
