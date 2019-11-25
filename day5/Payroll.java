package com.hcl.day5;

public class Payroll {
    static int totalsalary;
   
        public void addsalary(int salary) {
            totalsalary+=salary;
        }
        public static void main(String[] args) {
            Payroll empbharath=new Payroll();
            Payroll empsowmya=new Payroll();
            Payroll empgayatri=new Payroll();
            empbharath.addsalary(334455);
            empsowmya.addsalary(334455);
            empgayatri.addsalary(334455);
            System.out.println("totalsalary " +Payroll.totalsalary);
        }
    }


;