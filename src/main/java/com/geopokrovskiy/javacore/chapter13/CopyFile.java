package com.geopokrovskiy.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        if(args.length != 2){
            System.out.println("using CopyFile from to");
            return;
        }

        try{
            fileInputStream = new FileInputStream(args[0]);
            fileOutputStream = new FileOutputStream(args[1]);

            do{
                i = fileInputStream.read();
                if(i != -1) fileOutputStream.write(i);
            } while (i != -1);
        } catch(IOException exception){
            System.out.println("i/o exception " + exception);
        } finally {
            try{
                if(fileInputStream != null) fileInputStream.close();
            } catch (IOException e1){
                System.out.println("i/o exception while input stream closing " + e1);
            }
            try {
                if(fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e2){
                System.out.println("i/o exception while output stream closing " + e2);
            }
        }
    }
}
