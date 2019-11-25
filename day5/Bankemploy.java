package com.hcl.day5;

public class Bankemploy {
    
        int empno;
        String name;
        String job;
        double salary;
        int leaveAvail;


public Bankemploy() {

}
public void assignLeave(Bankemploy[] arr) {
for (Bankemploy employ : arr) {
if(employ.job.equals("Manager")) {
employ.leaveAvail=30;
} else {
employ.leaveAvail=20;
}
}
}

public Bankemploy(int empno, String name, String job, double salary) {
super();
this.empno = empno;
this.name = name;
this.job = job;
this.salary = salary;
}
@Override
public String toString() {
    return "Bankemploy [empno=" + empno + ", name=" + name + ", job=" + job + ", salary=" + salary + ", leaveAvail="
            + leaveAvail + "]";
}


}
        
       



