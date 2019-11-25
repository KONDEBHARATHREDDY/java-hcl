package com.hcl.day3;

public class Strdemo {
    public void show() {
        String msg="welcome to hcl";
        System.out.println("length" +msg.length());
        System.out.println("first occurrence of 'a' is" +msg.indexOf('a'));
        System.out.println("last occurrence of 'a' is" +msg.lastIndexOf('a'));
        System.out.println("first occurrence of 'z'" +msg.indexOf('z'));
        System.out.println("char at 5th position" +msg.charAt(5));
        System.out.println("Lower case" +msg.toLowerCase());
        System.out.println("Upper case" +msg.toUpperCase());
        System.out.println("SubString" +msg.substring(1,10));
        System.out.println("Starts with" +msg.startsWith("welcome"));
        System.out.println("starts with" +msg.startsWith("hello"));
        System.out.println("concat string" +msg.toLowerCase());
        System.out.println("replaced string" +msg.concat("omr"));
        System.out.println("lower case" +msg.replace("java", "j2EE"));
        
        
        
    }
    public static void main(String[] args) {
        new Strdemo().show();
    }
}
