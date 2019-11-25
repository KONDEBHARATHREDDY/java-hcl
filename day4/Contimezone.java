package com.hcl.day4;

public class Contimezone {
public static void main(String[] args) {
    Timezone time=new Timezone();
    

    Timezone t1=new Timezone(5,45);
    Timezone t2=new Timezone(4,50);
    Timezone t3=new Timezone().addTime(t1,t2);
    System.out.println(t1);
    System.out.println(t1);
    System.out.println(t3);
    
}
}
