package com.geopokrovskiy.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        if(con == null) return;

        str = con.readLine("Enter your string: ");
        con.printf("Input string is here: %s\n", str);
    }
}
