package com.hcl.day5;

public class Customer {
    int custid;
    String name;
    String city;
    double premium;
    @Override
    public String toString() {
        return "Customer [custid=" + custid + ", name=" + name + ", city=" + city + ", premium=" + premium + "]";
    }
   
    public Customer(double premium, String city, String name, int custid) {
        super();
        this.custid = custid;
        this.name = name;
        this.city = city;
        this.premium = premium;
         
    }

    @Override
    public boolean equals(Object obj) {
        Customer cust=(Customer)obj;
        if (cust.city==city) {
            return true;
        } else {
            return false;
            
            
        }
    }

    public static void main(String[] args) {
        Customer cus=new Customer(201.6,"sai","ddd",30);
        Customer cus1=new Customer(202.5,"siri","tfg",46);
        Customer cus2=new Customer(203.8,"sri","ddfgf",367);
        Customer cus3=new Customer(204.9,"priya","dgg",39);
        
        Customer []arr={cus,cus1,cus2,cus3};
        for (Customer customer : arr) {
            System.out.println(customer);
            
        }
        System.out.println(cus1.equals(cus3));
                              
    }
    
    
}
    



