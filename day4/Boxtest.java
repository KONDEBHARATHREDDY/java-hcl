package com.hcl.day4;

public class Boxtest {
    
    /**
     * *
     * *
     * @param ob
     */
  public void show(Object ob) {
    String type = ob.getClass().getSimpleName();
    System.out.println(type);
    if (type.equals("Integer")) {
      System.out.println("Integer Casting...");
      int x = (Integer)ob;
    }
    if (type.equals("Double")) {
      System.out.println("Double Casting...");
            Double x = (Double)ob;
    }
    if (type.equals("String")) {
      System.out.println("String Casting...");
      String x = (String)ob;
    }
  }
  
  public static void main(String[] args) {
        
        
    int a = 12;
    double b = 12.5;
    String name = "hcl";
        
    Boxtest obj = new Boxtest();
    obj.show(a);
    obj.show(b);
    obj.show(name);
        
  }

}
