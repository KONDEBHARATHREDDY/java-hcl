package com.hcl.day4;

public class Timezone {
    int hrs;
    int mins;
  
    public Timezone(int hrs, int mins){
        super();
        this.hrs=hrs;
        this.mins=mins;
    }
  
        
    
    public Timezone addTime(Timezone t1, Timezone t2){
        Timezone t3=new Timezone();
        t3.hrs=t1.hrs+t2.hrs;
        t3.mins=t1.mins+t2.mins;
        if(t3.mins>=60) {
            t3.hrs++;
            t3.mins=t3.mins%60;
        }
        return t3;
    }
    
    public Timezone() {
        super();
        // TODO Auto-generated constructor stub
    }



    @Override
    public String toString() {
        return "Timezone [hrs=" + hrs + ", mins=" + mins + "]";
    }
    

}
