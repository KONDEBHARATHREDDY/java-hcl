package com.hcl.day4;

public class Empno {
   
    int empno;
    String name;
    double basic;
    @Override
    public boolean equals(Object obj) {
        Empno employ=(Empno)obj;
        if(employ.basic==basic) {
            return true;
        } else {
            return false;
        }
        
    }
    @Override
    public String toString() {
        return "Empno [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
    }
    
    

}
