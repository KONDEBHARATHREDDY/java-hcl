package com.hcl.day4;

public class Construct {
static{
    System.out.println("static Constructor...");
}
Construct() {
    System.out.println("general constructor");
}
public static void main(String[] args) {
    new Construct();
    
}
}
