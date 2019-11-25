package com.hcl.day5;

public class Leavehistory {
    int empno;
    int leaveTaken;
    Leavetype leaveType;
    Leavestatus leaveStatus;
    public Leavehistory(int empno, int leaveTaken, Leavetype leaveType) {
        super();
        this.empno = empno;
        this.leaveTaken = leaveTaken;
        this.leaveType = leaveType;
    }
    
    
    
    public Leavehistory() {
        super();
        // TODO Auto-generated constructor stub
    }



    @Override
    public String toString() {
        return "LeaveHistory [empno=" + empno + ", leaveTaken=" + leaveTaken
                + ", leaveType=" + leaveType + ", leaveStatus=" + leaveStatus
                + "]";
    }



    public void applyLeave(Bankemploy[] arr, Leavehistory leave) {
        for (Bankemploy employ : arr) {
            if(employ.empno==leave.empno) {
                if(employ.job.equals("Manager")) {
                    leave.leaveStatus=Leavestatus.APPROVED;
                } else {
                    leave.leaveStatus=Leavestatus.PENDING;
                }
            }
        }
    }

}
