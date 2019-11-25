package com.hcl.day4;

public class BoxEmploy {
public void show(Object ob) {
    String type=ob.getClass().getSimpleName();
    if(type.equals("Empno")) {
        Empno e=(Empno)ob;
        System.out.println(e);
    }
    
}
public static void main(String[] args) {
    Empno employ = new Empno();
    employ.empno=1;
    employ.name="sai";
    employ.basic=88524;
    new BoxEmploy().show(employ);
}
}
