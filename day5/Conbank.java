package com.hcl.day5;

public class Conbank {
    

        public static void main(String[] args) {
        Bankemploy employ1=new Bankemploy(1, "Shaleena", "Programmer", 68863);
        Bankemploy employ2=new Bankemploy(2, "Sandeep", "Manager", 68863);
        Bankemploy employ3=new Bankemploy(3, "Bharat", "TeamLead", 68863);
        Bankemploy employ4=new Bankemploy(4, "Sandesh", "Consultant", 68863);

        Bankemploy[] arr={employ1, employ2, employ3, employ4};

        new Bankemploy().assignLeave(arr);

        for (Bankemploy employ : arr) {
        System.out.println(employ);
        }
        }
        
        
        
}
        


