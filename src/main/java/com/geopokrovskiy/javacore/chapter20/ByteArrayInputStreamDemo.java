package com.geopokrovskiy.javacore.chapter20;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);

        int c;
        while((c = input1.read()) != -1){
            System.out.print((char) c);
        }

        System.out.println();

        while((c = input2.read()) != -1){
            System.out.print(Character.toUpperCase((char) c));
        }

    }
}
