package com.hcl.pack;

public class Inhdemo {
    public static void main(String[] args) {
        //First obj=new Second();
        //Second obj=new First(); //not working
//        obj.show();
//       obj.display();
        
//       Second s=(Second)new First();
//      s.show();
//      s.display();
        
        First f=(First)new Second();
        f.show(); //working code;
    }

}
