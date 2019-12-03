package com.hcl.department;

import java.util.List;

public class CreateAccountMain {
	public static void main(String[] args) {
		DepartmentDAO dao=new DepartmentDAO();
		List<Department> departmentList=dao.showDepartment();
		for(Department department:departmentList){
			System.out.println("Department no "+department.getDeptno());
			System.out.println("Department name "+department.getDname());
			System.out.println("Department loc "+department.getLoc());
			System.out.println("department city "+department.getCity());
			System.out.println("department head "+department.getHead());
			System.out.println("*************************");
		}
	}

}

