package com.hcl.day3;

public class Sbexample {
    public void show(){
        StringBuilder sb=new StringBuilder("welcome to java");
        System.out.println(sb);
        sb.append("from hcl batch alla the beat...");
        System.out.println(sb);
        sb.insert(3, "sneha");
        System.out.println(sb);
        sb.delete(3, 8);
        System.out.println(sb);
        sb.append("/n firstname validation failed..");
        System.out.println(sb);
        sb.append("/n lastname validation failed");
        System.out.println(sb);
    }
    public static void main(String[] args) {
        new Sbexample().show();
    }
        
        
    }


