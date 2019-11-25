package com.hcl.day4;

public class Demo2 {
    public void show(int x) {
        System.out.println("show w.r.t. Integer " +x);
    }
    public void show(double x) {
        System.out.println("show w.r.t. Double " +x);
    }
    public void show(String x) {
        System.out.println("show w.r.t. String " +x);
    }
    public void show(boolean x) {
        System.out.println("show w.r.t. Boolean " +x);
    }
  public static void main(String[] args) {
    Demo2 obj = new Demo2();
    obj.show(12);
    obj.show(12.44);
    obj.show("HCL");
    obj.show(true);
  }
}
