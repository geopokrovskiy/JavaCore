package com.geopokrovskiy.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now it's time to all god men to come to the country and pay the taxes. (no)";
        char[] buf = new char[source.length()];
        source.getChars(0, source.length(), buf, 0);

        try (FileWriter f0 = new FileWriter("file1.txt");
             FileWriter f1 = new FileWriter("file2.txt");
             FileWriter f2 = new FileWriter("file3.txt")) {

            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }
            f1.write(buf);
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException exception) {
            System.out.println("I/O exception");
        }
    }
}
