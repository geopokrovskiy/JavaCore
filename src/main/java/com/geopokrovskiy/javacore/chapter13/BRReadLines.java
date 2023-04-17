package com.geopokrovskiy.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the lines. Type 'stop' to exit.");
        String str;
        do{
            str = bufferedReader.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
