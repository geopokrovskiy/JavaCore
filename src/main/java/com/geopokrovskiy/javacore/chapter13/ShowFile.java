package com.geopokrovskiy.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream;
        if(args.length != 1){
            System.out.println("Using: ShowFile filename");
            return;
        }
        try{
            fileInputStream = new FileInputStream(args[0]);
        } catch (FileNotFoundException exception){
            System.out.println("Impossible to open the file");
            return;
        }

        try{
            do{
                i = fileInputStream.read();
                if(i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e){
            System.out.println("File reading error.");
        }

        try{
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("File closing error.");
        }
    }
}
