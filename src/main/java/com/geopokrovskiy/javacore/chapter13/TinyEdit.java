package com.geopokrovskiy.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[100];
        System.out.println("Enter the strings. Enter 'stop' to exit.");
        for(int i = 0; i < 100; i++){
            strings[i] = bufferedReader.readLine();
            if(strings[i].equals("stop")) break;
        }
        System.out.println("Content of your file: \n");
        for(int i = 0; i < 100; i++){
            if(strings[i].equals("stop")) break;
            System.out.println(strings[i]);
        }
    }
}
