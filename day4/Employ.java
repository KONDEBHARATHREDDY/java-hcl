package com.hcl.day4;

public class Employ {
int empno;
String name;
double basic;

public Employ() {
    empno=5;
    name="sravi";
    basic=33445;
}
public Employ(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
}
@Override
public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
}



}
