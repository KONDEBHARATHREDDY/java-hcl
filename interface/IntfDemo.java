package com.hcl.intf;

interface ITraining {
    void name();
    void email();
}

class niharika implements ITraining {

    @Override
    public void name() {
        System.out.println("name is niharika");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void email() {
        System.out.println("email niharika.com");
        // TODO Auto-generated method stub
        
    }
    
}
class deepak implements ITraining {

    @Override
    public void name() {
        System.out.println("name is deepak");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void email() {
        System.out.println("email deepak@gmail.com");
        // TODO Auto-generated method stub
        
    }
    
}

public class IntfDemo {
    public static void main(String[] args) {
        ITraining[] arrTraining=
            {
                new deepak(),
                new niharika()
    };
        for (ITraining iTraining :arrTraining) {
            iTraining.name();
            iTraining.email();
        }
    }
}
