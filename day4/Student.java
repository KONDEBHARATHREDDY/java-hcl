package com.hcl.day4;

public class Student {
    int sno;
    String firstname;
    String lastname;
    double cgp;
    @Override
    public String toString() {
        return "Student [sno=" + sno + ", firstname=" + firstname + ", lastname=" + lastname + ", cgp=" + cgp + "]";
    }
    @Override
    public boolean equals(Object obj) {
        Student Student=(Student)obj;
        if(Student.cgp==cgp) {
            return true;
        } else {
            return false;
        }
     
    }
  

}
