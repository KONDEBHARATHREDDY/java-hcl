package com.hcl.day3;

public class Arraydemo2 {
    public void show() {
        String[] names={"sneha","kamakshi","sai","teja","laxmi"};
        for(String string : names) {
            System.out.println(string);
        }
    }
    public static void main(String[] args) {
        new Arraydemo2().show();
    }

}
