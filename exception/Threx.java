package com.hcl.ex;

public class Threx {
    public void check(int n) {
        boolean flag=true;
        if(n<0) {
            flag=false;
            throw new ArithmeticException("negative nos not allowed");
        }
        if(n==0) {
            flag=false;
            throw new NumberFormatException("zero is invalid");
        }
        if(flag==true) {
            System.out.println("n value " +n);
        }
    }
    public static void main(String[] args) {
        int n=0;
        try {
            new Threx().check(n);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
