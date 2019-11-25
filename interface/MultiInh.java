package com.hcl.intf;

interface Ione {
    void name();
}

interface Itwo {
    void email();
}
class Demo implements Ione, Itwo {

    @Override
    public void email() {
        System.out.println("email hcl@gmail.com");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void name() {
        System.out.println("company hcl");
        // TODO Auto-generated method stub
        
    }
    
}
public class MultiInh {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.name();
        obj.email();
    }

}
