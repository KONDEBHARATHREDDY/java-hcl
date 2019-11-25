package com.hcl.day5;

public class Stdemo {
    void show() {
        System.out.println("show method...");
    }
    static void display() {
        System.out.println("from display method...");
    }
    public static void main(String[] args) {
        new Stdemo().show();
        Stdemo.display();
    }

}
