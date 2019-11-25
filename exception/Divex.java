package com.hcl.ex;

public class Divex {
    public static void main(String[] args) {
        int a,b,c;
        try {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=a/b;
            System.out.println("Division " +c);
        }catch(NumberFormatException e) {
            System.out.println("string cannot be convert as integer");
        }
        catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("Args are not passed...");   
        }
        catch (ArithmeticException e) {
            // TODO Auto-generated catch block
          System.out.println("Division by zero impossible");
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("program completed");
        }
    }

}
