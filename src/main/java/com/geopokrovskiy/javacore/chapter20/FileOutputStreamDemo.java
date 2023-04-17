package com.geopokrovskiy.javacore.chapter20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now it's time to all god men to come to the country and pay the taxes. (no)";
        byte[] buf = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");

            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }
            f1.write(buf);
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("I/O exception");
        } finally {
            try {
                if (f0 != null) f0.close();
            } catch (IOException e) {
                System.out.println("Exception in file1 closing");
            }

            try {
                if (f1 != null) f1.close();
            } catch (IOException e) {
                System.out.println("Exception in file2 closing");
            }

            try {
                if (f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("Exception in file2 closing");
            }
        }

    }
}
