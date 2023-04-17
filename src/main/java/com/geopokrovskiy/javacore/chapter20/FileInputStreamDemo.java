package com.geopokrovskiy.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        String filename = "C:\\Users\\georg\\IdeaProjects\\Eugeniy\\JavaCore\\JavaCore\\src\\main\\java\\com\\geopokrovskiy\\javacore\\chapter20\\FileInputStreamDemo.java";
        try(FileInputStream f = new FileInputStream("FileInputStreamDemo.java")){
            System.out.println("bytes available: " + (size = f.available()));
            int n  = size / 40;
            System.out.println("First " + n  + " bytes read from the file by read() method");
            for(int i = 0; i < n; i++){
                System.out.println((char) f.read());
            }
            System.out.println("\n Still available: " + f.available());
            System.out.println("Reading of the next " + n  + " bytes by read(b[]) method");
            byte[] b = new byte[n];
            if(f.read(b) != n) System.out.println("Cannot read " + n + " bytes");
            System.out.println(new String(b, 0, n));
            System.out.println("bytes still available: " + (size = f.available()));
            System.out.println("Skipping a half of bytes by skip() method)");
            f.skip(size / 2);
            System.out.println("bytes still available: " + (size = f.available()));
            System.out.println("Reading of " + n/2 + " bytes placed in the end of the array.");
            if(f.read(b, n/2, n/2) !=n/2){
                System.out.println("Cannot read " + n/2 + " bytes!");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("bytes still available: " + (size = f.available()));
        } catch (IOException exception){
            System.out.println("I/O exception.");
        }
    }
}
