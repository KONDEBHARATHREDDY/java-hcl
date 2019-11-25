package com.hcl.abst;

abstract class employ {
    int empno;
    String name;
    double salary;
    public employ(int empno, String name, double salary) {
        super();
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "employ [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
    }
    
}
class sravani extends employ {

    public sravani(int empno, String name, double salary) {
        super(empno, name, salary);
        // TODO Auto-generated constructor stub
    }
    
}
class siri extends employ {

    public siri(int empno, String name, double salary) {
        super(empno, name, salary);
        // TODO Auto-generated constructor stub
    }
    
}

public class Abscon {
    public static void main(String[] args) {
        employ[] arremploy=
            {
                    new sravani(1, "sravani", 2568),
                    new siri(3, "siri", 4546657)
            };
        for (employ employ : arremploy) {
            System.out.println(employ);
            
        }
    }

}
