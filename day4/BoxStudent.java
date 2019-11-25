package com.hcl.day4;

public class BoxStudent {
    public void show(Object ob)
    {
        String type=ob.getClass().getSimpleName();
        if(type.equals("Student")) {
            Student e=(Student)ob;
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        Student Student = new Student();
        Student.firstname="jjj";
        Student.lastname="sai";
        Student.cgp=8.5;
        new BoxStudent().show(Student);
    }

}
