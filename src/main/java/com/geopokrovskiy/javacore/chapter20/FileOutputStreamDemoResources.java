package com.geopokrovskiy.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemoResources {

    public static void main(String[] args) {
        String source = "Now it's time to all god men to come to the country and pay the taxes. (no)";
        byte[] buf = source.getBytes();
        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
             FileOutputStream f1 = new FileOutputStream("file2.txt");
             FileOutputStream f2 = new FileOutputStream("file3.txt")) {

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
