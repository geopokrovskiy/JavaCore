package com.geopokrovskiy.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("https://java-blog.ru/osnovy");

        System.out.println("protocol: " + hp.getProtocol());
        System.out.println("port " + hp.getPort());
        System.out.println("host " + hp.getHost());
        System.out.println("file " + hp.getFile());
        System.out.println("external form " + hp.toExternalForm());

    }
}
