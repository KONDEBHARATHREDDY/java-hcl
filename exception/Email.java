package com.hcl.ex;

class InvalidemailException extends Exception {
    InvalidemailException(String error) {
        super(error);
    }
}
class InvaliduserException extends Exception{
InvaliduserException(String error) {
    super(error);
}
}
public class Email {
    public void check(String email) {
            boolean flag=true;
    if(email=="@") {
        flag=false;
        throw new  InvalidemailException ("Negative nos not allowed");
        
    }
}
} 
