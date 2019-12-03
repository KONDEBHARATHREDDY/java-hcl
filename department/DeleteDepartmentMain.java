package com.hcl.department;


import java.util.Scanner;

public class DeleteDepartmentMain {
	public static void main(String[] args) {
		int Deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ no:");
		Deptno=sc.nextInt();
		DepartmentDAO dao=new DepartmentDAO();
		System.out.println(dao.deleteDepartment(Deptno));
	}

}
