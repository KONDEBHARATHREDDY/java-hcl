package com.hcl.day3;

public class Casedemo {
public void show(String dayName) {
    switch(dayName) {
    case "Monday":
       System.out.println("its working day 1");
       break;
    case "tuesday":
       System.out.println("its working day2");
    break;
    case "wednesday":
        System.out.println("its working day3");
        break;
    }
}
public static void main(String[] args) {
    new Casedemo().show("Monday");
}
}
