package com.hcl.abst;

abstract class hcltraining {
    abstract void logintime();
    abstract void employname();
    abstract void logouttime();
}

class Harika extends hcltraining {

    @Override
    void logintime() {
        System.out.println("came at 9:30 AM");
        // TODO Auto-generated method stub
        
    }

    @Override
    void employname() {
        System.out.println("hi i am sravani");
        // TODO Auto-generated method stub
        
    }

    @Override
    void logouttime() {
        System.out.println("logout time 6:00");
        // TODO Auto-generated method stub
        
    }
    
}
class teja extends hcltraining {

    @Override
    void logintime() {
        System.out.println("teja came by 7.30 am");
        // TODO Auto-generated method stub
        
    }

    @Override
    void employname() {
        System.out.println("hi i am sai teja");
        // TODO Auto-generated method stub
        
    }

    @Override
    void logouttime() {
        System.out.println("teja logout by 8.30pm");
        // TODO Auto-generated method stub
        
    }
    
}
public class Absdemo {
    public static void main(String[] args) {
        hcltraining[] arrtrining=
            {
                    new Harika(),
                    new teja()
            };
        for (hcltraining hcltraining : arrtrining) {
            hcltraining.employname();
            hcltraining.logintime();
            hcltraining.logouttime();
            
        }
    }

}
