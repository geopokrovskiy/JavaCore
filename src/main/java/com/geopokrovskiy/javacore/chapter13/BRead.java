package com.geopokrovskiy.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRead {

    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type the symbols, 'q' for exit");
        do{
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}

// Не особо хороший метод, потому что ридер ничего не будет читать, до тех пор пока не будет нажат enter
