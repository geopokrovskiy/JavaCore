package com.geopokrovskiy.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This data should be in the array";
        byte[] buf = s.getBytes();

        try{
            f.write(buf);
        } catch (IOException e){
            System.out.println("Buffer writing exception");
            return;
        }

        System.out.println("String-like buffer");
        System.out.println(f.toString());
        System.out.println("To array");
        byte[] b = f.toByteArray();
        for(int i = 0; i < b.length; i++){
            System.out.println((char) b[i]);
        }

        System.out.println("OutputStream():");
        try(FileOutputStream f2 = new FileOutputStream("test.txt")){
            f.writeTo(f2);
        } catch (IOException e){
            System.out.println("I/O exception " + e);
            return;
        }

        System.out.println("Reset to the initial state");
        f.reset();

        for(int i = 0; i < 3; i++){
            f.write('X');
        }
        System.out.println(f.toString());

    }
}
