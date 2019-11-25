package com.hcl.abst;

abstract class student {
    int sno;
    String sname;
    double cgp;
    public student(int sno, String sname, double cgp) {
        super();
        this.sno = sno;
        this.sname = sname;
        this.cgp = cgp;
    }
    @Override
    public String toString() {
        return "student [sno=" + sno + ", sname=" + sname + ", cgp=" + cgp + "]";
    }
    
}
class priya extends student {

    public priya(int sno, String sname, double cgp) {
        super(sno, sname, cgp);
        // TODO Auto-generated constructor stub
    }

   
    }
    
class prasanthi extends student {

    public prasanthi(int sno, String sname, double cgp) {
        super(sno, sname, cgp);
        // TODO Auto-generated constructor stub
    }
    
}
class sri extends student {

    public sri(int sno, String sname, double cgp) {
        super(sno, sname, cgp);
        // TODO Auto-generated constructor stub
    }

    
    }

   

public class Absstudent {
    public static void main(String[] args) {
        student[] arrstudent=
            {
                    new priya(1, "priya", 3244),
                    new prasanthi(2,"prasanthi", 343),
                    new sri(3, "sri",445)
            };
        for (student student : arrstudent) {
            System.out.println(student);
            
        }
    }

}
