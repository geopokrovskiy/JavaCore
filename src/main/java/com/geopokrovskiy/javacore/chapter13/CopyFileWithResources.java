package com.geopokrovskiy.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileWithResources {
    public static void main(String[] args) {
        int i;

        if (args.length != 2) {
            System.out.println("using CopyFile from to");
            return;
        }

        try (FileInputStream fileInputStream = new FileInputStream(args[0]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[1])) {
            do {
                i = fileInputStream.read();
                if (i != -1) fileOutputStream.write(i);
            } while (i != -1);
        } catch (IOException exception) {
            System.out.println("i/o exception " + exception);
        }
    }
}
