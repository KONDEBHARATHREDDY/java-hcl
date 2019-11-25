package com.hcl.ex;

public class Arrex {
    public static void main(String[] args) {
        int[] a=new int[]{12,5};
        try {
            a[10]=6;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array size small");
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
