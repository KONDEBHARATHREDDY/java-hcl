package com.hcl.day4;

public class Quiz {
    public static void main(String[] args) {
        Empno e1=new Empno();
        Empno e2=new Empno();
        System.out.println(e1==e2);
        e1.empno=1;
        e1.name="sowmya";
        e1.basic=23344;
        e2.empno=2;
        e2.name="anusha";
        e2.basic=23344;
        System.out.println(e1.equals(e2));
    }

}
