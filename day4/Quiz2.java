package com.hcl.day4;

public class Quiz2 {
    public static void main(String[] args) {
        Student e1=new Student();
        Student e2=new Student();
        System.out.println(e1==e2);
        e1.firstname="rrr";
        e1.lastname="sowmya";
        e1.cgp=8.5;
        e2.firstname="sss";
        e2.lastname="anusha";
        e2.cgp=7.5;
        System.out.println(e1.equals(e2));
    }

}
