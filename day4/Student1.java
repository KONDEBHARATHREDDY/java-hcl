package com.hcl.day4;

public class Student1 {
    
int sno;
String firstname;
String lastname;
double cgp;
public Student1() {
    sno=2;
    firstname="eee";
    lastname="sri";
    cgp=9.2;
}
public Student1(int sno, String firstname, String lastname, double cgp){
    super();
    this.sno=sno;
    this.firstname = firstname;
    this.lastname = lastname;
    this.cgp = cgp;
}

@Override
public String toString() {
    return "Student1 [sno=" + sno + ", firstname=" + firstname + ", lastname=" + lastname + ", cgp=" + cgp + "]";
}





}
