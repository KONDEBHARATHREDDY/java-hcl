package com.hcl.files;

import java.io.File;

public class Filedemo {
    public static void main(String[] args) {
        File f1=new
         File("C:/javatraining/day3/Demoproject/src/com/hcl/ex/Custom.java");
        System.out.println("filename " +f1.getName());
        System.out.println("parent " +f1.getParent());
        System.out.println("path " +f1.getPath());
    }

}
