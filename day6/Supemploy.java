package com.hcl.day6;
class hclemploy {
 String sname;
 String name;
 String gender;
 String designation;
public hclemploy(String sname, String name, String gender, String designation) {
    super();
    this.sname = sname;
    this.name = name;
    this.gender = gender;
    this.designation = designation;
}
@Override
public String toString() {
    return "hclemploy [sname=" + sname + ", name=" + name + ", gender=" + gender + ", designation=" + designation + "]";
}
}
 class Sravani extends hclemploy {

    public Sravani(String sname, String name, String gender, String designation) {
        super(sname, name, gender, designation);
        // TODO Auto-generated constructor stub
    }
}
 class siri extends hclemploy {

    public siri(String sname, String name, String gender, String designation) {
        super(sname, name, gender, designation);
        // TODO Auto-generated constructor stub
    }
     
 }
 class prasanthi extends hclemploy {

    public prasanthi(String sname, String name, String gender, String designation) {
        super(sname, name, gender, designation);
        // TODO Auto-generated constructor stub
    }
     
 }
public class Supemploy {
    
    public static void main(String[] args) {
        hclemploy prasanthi=new prasanthi("sss","ggg", "fmale", "softeng");
        hclemploy siri=new siri("sdf","hghj", "fmale", "softeng");
        hclemploy sravani=new Sravani("sff","fff", "fmale", "softeng");
        hclemploy[] arrhcl={prasanthi,siri,sravani};
        for (hclemploy hclemploy : arrhcl) {
            System.out.println(hclemploy);
        }
        
    }
}



