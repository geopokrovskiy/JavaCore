package com.geopokrovskiy.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This data should be output to the array";
        char buf[] = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try{
            f.write(buf);
        } catch (IOException e){
            System.out.println("Buffered writing exception");
            return;
        }

        System.out.println("String-like buffer");
        System.out.println(f.toString());
        System.out.println("To array");

        char[] c = f.toCharArray();
        for(int i = 0; i< c.length; i++){
            System.out.print(c[i]);
        }

        System.out.println("\n To FileWriter output stream\n");
        try(FileWriter f2 = new FileWriter("test.txt")){
            f.writeTo(f2);
        }
        catch (IOException e){
            System.out.println("IO exception");
        }

        System.out.println("Reset to the initial state");
        f.reset();

        for(int i = 0; i < 3; i++){
            f.write('X');
        }

        System.out.println(f.toString());
    }
}
