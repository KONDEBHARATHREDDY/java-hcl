package com.hcl.project;

import java.util.List;

public class StudentBal {

	static StringBuilder sb=new StringBuilder();
	public boolean addStudentBal(Student objStudent) throws StudentException {
  boolean isAdded=true;
   if(objStudent.getSno()<=0) {
	   sb.append("student no cannot be negative or zero \r\n");
	   isAdded=false;
   }
   if(objStudent.getName().length()<=3) {
	   sb.append("name more than 3 characters \r\n");
	   isAdded=false;
   }
   if(objStudent.getCity().length()<=3) {
	   sb.append("city morethan 3 characters\r\n");
	   isAdded=false;
   }
   if(objStudent.getCgpa()<0) {
	   sb.append("cgpa cannot be negative \r\n");
	   isAdded=false;
   }
   if(isAdded==false) {
	   throw new StudentException(sb.toString());
   }else {
	   new StudentDao().addStudentDao(objStudent);
	   
   }
   return isAdded;
	   }
	public List<Student> showStudentBal() {
		return new StudentDao().showStudentDao();
	}
	public Student searchStudentBal(int sno) {
		return  new StudentDao().searchStudentDao(sno);
	}
	public String updateStudentBal(Student objStudent) {
		return new StudentDao().updateStudentDao(objStudent);
		
	}
	public String deleteStudentBal(int sno) {
		return new StudentDao().deletestudentDao(sno);
	}
}
