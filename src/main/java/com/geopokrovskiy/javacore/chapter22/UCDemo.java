package com.geopokrovskiy.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d == 0) {
            System.out.println("No data about the date");
        } else {
            System.out.println("Date: " + new Date(d));
        }

        //get content type
        System.out.println("content type: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("No data about the expiration date");
        } else {
            System.out.println("Expiration date: " + new Date(d));
        }

        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("No data about last modification date");
        } else {
            System.out.println("Last modification date: " + new Date(d));
        }

        long len = hpCon.getContentLengthLong();
        if (len == -1) {
            System.out.println("cONTENT length is not available");
        } else {
            System.out.println("content length: " + len);
        }

        if (len != 0) {
            System.out.println(" === content ===");
            InputStream input = hpCon.getInputStream();
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("content is not available");
        }
    }
}
