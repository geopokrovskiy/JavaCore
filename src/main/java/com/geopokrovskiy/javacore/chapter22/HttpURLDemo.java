package com.geopokrovskiy.javacore.chapter22;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception{
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Method: " + hpCon.getRequestMethod());

        System.out.println("Response code: " + hpCon.getResponseCode());

        System.out.println("Response message: " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\n header: ");

        for(String k: hdrField){
            System.out.println("key: " + k + " value: " + hdrMap.get(k));
        }
    }
}
