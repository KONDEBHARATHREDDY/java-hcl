package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereadex {

    public static void main(String[] args) throws IOException {
        File f1=new
                File("C:/javatraining/day3/Demoproject/src/com/hcl/ex/Custom.java");
      
            FileReader fr=new FileReader(f1);
            int ch;
            while((ch=fr.read()) !=-1) {
                System.out.print((char)ch);
                
            }
            try {
                fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } 
                
    }

